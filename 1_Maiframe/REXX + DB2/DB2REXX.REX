****** ***************************** Top of Data ******************************
=COLS> ----+----1----+----2----+----3----+----4----+----5----+----6----+----7--
000100 /* REXX */                                                              
000200 /* ------------------------------------------------------- */           
000300 /* NAME: REXX CONNECT TO DB2                               */           
000400 /* TYPE: OBJECT REXX SCRIPT                                */           
000500 /* AUTHOR: LEE                                             */           
000600 /* RESOURCE:                                               */           
000800 /* DESCRIPTION:                                            */           
001000 /*   REXX CONNECT DB2 AND THE RELATED OPERATION            */           
001100 /* ------------------------------------------------------- */           
001200 LOCAL_DB2=DSN8G                                                         
001300 CALL CONNECT_DB2                                                        
001400 CALL RUN_SQL                                                            
001500 CALL DISCONNECT_DB2                                                     
001600 EXIT                                                                    
001700                                                                         
001800 CONNECT_DB2:                                                            
001900 /* ------------------------------------------------------- */           
002000 /* NAME: REXX CONNECT TO DB2                               */           
002100 /* ------------------------------------------------------- */           
002200 ADDRESS DSNREXX                                                         
002300 RC = 'SUBCOM DSNREXX'                                                   
002400 IF RC <> 0 THEN DO                                                      
002500    S_RC = RXSUBCOM('ADD','DSNREXX','DSNREXX')                           
002600 END                                                                     
002700                                                                         
002800 "CONNECT " LOCAL_DB2                                                    
002900 IF SQLCODE <> +0 THEN DO                                                
003000    MY_ERROR = 'ERROR CONNECTING TO DB2 ' LOCAL_DB2                      
003100    CALL DISPLAY_SQLCA                                                   
003200 END                                                                     
003300                                                                         
003400 EXECSQL "SET CURRENT PACKAGESET='DSNREXCS'"                             
003500 IF SQLCODE <> +0 THEN DO 
003600    MY_ERROR = 'ERROR SETTING CURRENT PACKAGESET=DSNREXCS'               
003700    CALL DISPLAY_SQLCA                                                   
003800 END                                                                     
003900                                                                         
004000 RETURN                                                                  
004100                                                                         
004200 RUN_SQL:                                                                
004300 /* ------------------------------------------------------- */           
004400 /* NAME: RUN DB2 SQL                                       */           
004500 /* ------------------------------------------------------- */           
004600 SQLSTMT =,                                                              
004700 "SELECT   SUBSTR(NAME,01,10) AS NAME                                    
004800 ",                                                                      
004900 "        ,SUBSTR(CREATOR,01,10) AS CREATOR                              
005000 ",                                                                      
005100 "FROM     SYSIBM.SYSTABLES                                              
005200 ",                                                                      
005300 "WHERE    NAME = CAST(? AS VARCHAR(128))                                
005400 ",                                                                      
005500 "WITH     UR                                                            
005600 "                                                                       
005610                                                                         
005700 IN_SQL = SQLSTMT                                                        
005800 CALL STRIP_BLANKS                                                       
005900                                                                         
006000 SQLSTMT = OUT_SQL                                                       
006100                                                                         
006200 ADDRESS DSNREXX                                                         
006300 EXECSQL 'DECLARE C1 CURSOR FOR S1'                                      
006400 IF  SQLCODE < +0 THEN DO                                                
006500     MY_ERROR = 'ERROR OPENING CURSOR C1'                                
006600     CALL DISPLAY_SQLCA                                                  
006700 END                                                                     
006800                                                                         
006900 EXECSQL 'PREPARE S1 INTO :OUTSQLDA FROM :SQLSTMT'                       
007000 IF  SQLCODE <  +0 THEN DO                                               
007100     MY_ERROR = 'ERROR PREPARING STATMENT S1' SQLSTMT                    
007200     CALL DISPLAY_SQLCA                                                  
007300 END                                                                     
007400                                                                         
007500 IN_NAME    = 'SYSTABLES'                                                
007600                                                                         
007700 EXECSQL 'OPEN C1 USING :IN_NAME'                                        
007800 IF  SQLCODE <  +0 THEN DO                                               
007900     MY_ERROR = 'ERROR OPENING CURSOR C1'                                
008000     CALL DISPLAY_SQLCA                                                  
008100 END                                                                     
008200 CLEAR                                                                   
008300 DO UNTIL SQLCODE = +100                                                 
008400    EXECSQL 'FETCH C1 INTO :VAL_01, :VAL_02'                             
008500                                                                         
008600    SELECT                                                               
008700      WHEN  SQLCODE = +0   THEN                                          
008800              DO                                                         
008900                SAY 'SQLCODE 0. FETCHED BELOW DATA'                      
009000                SAY 'TABLE NAME : ' VAL_01                               
009100                SAY 'CREATOR    : ' VAL_02                               
009200              END                                                        
009300      WHEN  SQLCODE = +100 THEN                                          
009400              DO                                                         
009500                SAY 'SQLCODE 100. NO MORE DATA TO FETCH'                 
009600              END                                                        
009700      OTHERWISE                                                          
009800              MY_ERROR = 'ERROR FETCHING CURSOR C1'                      
009900              CALL DISPLAY_SQLCA                                         
010000    END                                                                  
010100 END                                                                     
010200 EXECSQL 'CLOSE C1'                                                      
010300 IF  SQLCODE <  +0 THEN DO                                               
010400     MY_ERROR = 'ERROR CLOSING CURSOR C1'                                
010500     CALL DISPLAY_SQLCA                                                  
010600 END                                                                     
010700                                                                         
010800 RETURN                                                                  
011100                                                                         
011200 DISCONNECT_DB2:                                                         
011300 /* ------------------------------------------------------- */           
011400 /* NAME: REXX DISCONNECT TO DB2                            */           
011500 /* ------------------------------------------------------- */           
011600 ADDRESS DSNREXX                                                         
011700                                                                         
011800 "DISCONNECT"                                                            
011900 IF SQLCODE <> +0 THEN DO                                                
012000    CALL DISPLAY_SQLCA                                                   
012100 END                                                                     
012200                                                                         
012300 S_RC = RXSUBCOM('DELETE','DSNREXX','DSNREXX')                           
012500 RETURN                                                                  
012510                                                                         
012520 STRIP_BLANKS:                                                           
012600 /* ------------------------------------------------------- */           
012700 /* NAME: STRIPS THE BLANKS FROM SQL STATEMENTS             */           
012800 /* ------------------------------------------------------- */           
012900 LOOP_END = LENGTH(IN_SQL)                                               
013000 OUT_SQL  = SUBSTR(IN_SQL,01,01)                                         
013100                                                                         
013200 DO I = 2 TO LOOP_END                                                    
013300    J = I - 1                                                            
013400    IF  SUBSTR(IN_SQL,I,01) = ' ' & SUBSTR(IN_SQL,J,01) = ' ' THEN       
013500        DO                                                               
013600          NOP                                                            
013700        END                                                              
013800    ELSE                                                                 
013900          OUT_SQL = OUT_SQL || SUBSTR(IN_SQL,I,01)                       
014000 END                                                                     
014100                                                                         
014200 RETURN                                                                  
014300                                                                         
014400 DISPLAY_SQLCA:                                                          
014600 /* ------------------------------------------------------- */           
014700 /* NAME: DISPLAY FORMATED MESSAGES FROM THE DSNTIAR        */           
014710 /* DB2 MESSAGE                                             */           
014720 /* FORMATTING ROUTINE                                      */           
014800 /* ------------------------------------------------------- */           
014900 TRACE OFF                                                               
015000                                                                         
015100 MLEN = 72                                                               
015200 MLIN = 15                                                               
015300 MTOT = MLEN * MLIN                                                      
015400                                                                         
015500 SQLERRML = LENGTH(SQLERRMC)                                             
015600                                                                         
015700 SQLCAID = "SQLCA   "                                                    
015800 SQLCABC = X2C(D2X(136,8))                                               
015900 MSG_TEXT = X2C(D2X(MTOT,4))||COPIES(' ',MTOT)                           
016000 MSG_LEN = X2C(D2X(MLEN,8))                                              
016100 SQLCA = SQLCAID||SQLCABC||X2C(D2X(SQLCODE,8))||,                        
016200         X2C(D2X(SQLERRML,4))||,                                         
016300         SQLERRMC||COPIES(' ',70-SQLERRML)||,                            
016400         SQLERRP||,                                                      
016500         SQLERRD||SQLWARN||SQLSTATE                                      
016600 ADDRESS ATTCHPGM 'DSNTIAR SQLCA MSG_TEXT MSG_LEN'                       
016700                                                                         
016800 X = 4                                                                   
016900 DO I = 1 TO MLIN                                                        
017000    TXT = SUBSTR(MSG_TEXT,X,MLEN)                                        
017100    IF STRIP(TXT) > "" THEN MY_ERROR = MY_ERROR || ' ' || TXT            
017200    X = X + MLEN                                                         
017300 END                                                                     
017400                                                                         
017500 CALL DISPLAY_ERROR_MSG                                                  
017600 RETURN                                                                  
017610                                                                         
017620 DISPLAY_ERROR_MSG:                                                      
017700 /* ------------------------------------------------------- */           
017800 /* NAME: DISPLAY ERROR MESSAGE                             */           
018100 /* ------------------------------------------------------- */           
018200 CLEAR                                                                   
018300 SAY 'SQL STATEMENT WAS:'                                                
018400 SAY SQLSTMT                                                             
018500                                                                         
018600 SAY ' '                                                                 
018700 SAY 'SQL ERROR:'                                                        
018800 SAY MY_ERROR                                                            
018900                                                                         
019000 EXIT 0                                                                  
019100                                                                         
019200 RETURN                                                                  
****** **************************** Bottom of Data ****************************                                               