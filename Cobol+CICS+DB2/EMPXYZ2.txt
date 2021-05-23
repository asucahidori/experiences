****** ***************************** Top of Data ******************************
=COLS> ----+----1----+----2----+----3----+----4----+----5----+----6----+----7--
000010       ********************************************************          
000011       * C O B O L - C I C S - D B 2                                     
000012       * OBTAINS THE AVERAGE SALARY OF EMPLOYEES OF A GIVEN              
000013       * DEPART.                                                         
000020       ********************************************************          
000030       *----------------------------------------------                   
000100        IDENTIFICATION                  DIVISION.                        
000200        PROGRAM-ID.                     EMPXYZ2.                         
000210       *                                                                 
000300        AUTHOR.                         LEE.                             
000400       *                                                                 
000410       *----------------------------------------------                   
000500        ENVIRONMENT                     DIVISION.                        
000501       *----------------------------------------------                   
000502        CONFIGURATION                   SECTION.                         
000510        INPUT-OUTPUT                    SECTION.                         
000520        FILE-CONTROL.                                                    
000530        DATA DIVISION.                                                   
000540       *----------------------------------------------                   
000550        FILE SECTION.                                                    
000551       *----------------------------------------------                   
000560       *                                                                 
000561        WORKING-STORAGE SECTION.                                         
000570       *---------------------------------------------*                   
000600       * WORKAGEAS                                   *                   
000610       *---------------------------------------------*                   
000620        01 SWITCH.                                                       
000630          05 DATA-IS                    PIC X VALUE 'Y'.                 
000640             88 DATA-IS-O                     VALUE 'Y'.                 
000650          05 SEND-IND                   PIC X.                           
000660             88 SEND-IND-ERASE                VALUE '1'.                 
000670             88 SEND-IND-DATAO                VALUE '2'.                 
000680             88 SEND-IND-ALARM                VALUE '3'.                 
000690        01 COMMUNICATION-AREA           PIC X.                           
000691        01 MSGLINET.                                                     
000692           02 MSGSQLC                   PIC X(8).                        
000693           02 FILLER                    PIC X.                           
000694           02 MSGREST                   PIC X(69).                       
000695       *--------------------------------------------*                    
000696       * DB2 HOST VARIABLES DECLARATION             *                    
000697       *--------------------------------------------*                    
000698         01 WORKDEPT-HV                 PIC X(3).                        
000699         01 SALARY-HV                   PIC X(11).                       
000700         01 SALARY-IN                   PIC S9(4) COMP-5.                
000701       *--------------------------------------------*                    
000702       * SQLCA DECLARATION                          *   
000703       *--------------------------------------------*                    
000704            EXEC SQL INCLUDE SQLCA END-EXEC.                             
000705       *--------------------------------------------*                    
000706       * DFHAID                                     *                    
000707       *--------------------------------------------*                    
000708            COPY DFHAID.                                                 
000709       *--------------------------------------------*                    
000710       * MAP COPY                                   *                    
000711       *--------------------------------------------*                    
000712            COPY MAPONL.                                                 
000713       *--------------------------------------------*                    
000714       * DECLARE OF DB2 TABLE                       *                    
000715       *--------------------------------------------*                    
000716            EXEC SQL                                                     
000717             DECLARE EMP TABLE                                            
000718             (EMPNO        CHAR(6)      NOT NULL,                        
000719              FIRSTNAME    VARCHAR(12)  NOT NULL,                        
000720              MIDINIT      CHAR(1)      NOT NULL,                        
000721              LASTNAME     VARCHAR(15)  NOT NULL,                        
000722              WORKDEPT     CHAR(3)              ,                        
000723              PHONENO      CHAR(4)              ,                        
000724              HIREDATE     DATE                 ,                        
000725              JOB          CHAR(8)              ,                        
000726              EDLEVEL      SMALLINT             ,                        
000727              SEX          CHAR(1)              ,                        
000728              BIRTHDATE    DATE                 ,                        
000729              SALARY       DECIMAL(9,2)         ,                        
000730              BONUS        DECIMAL(9,2)         ,                        
000731              COMM         DECIMAL(9,2)         )                        
000732            END-EXEC.                                                    
000733        01  DFHCOMMAREA    PIC X.                                        
000734       *                                                                 
001518       *-------------------------------------------------------*         
001519       *** PROCEDURE             DIVISION.                               
001520       *-------------------------------------------------------*         
001521       *                                                                 
001522        PROCEDURE             DIVISION USING DFHCOMMAREA.                
001523       *-------------------------------------------------------*         
001524       *  MAIN PROGRAM ROUTINE                                 *         
001525       *-------------------------------------------------------*         
001526        MAINLINE.                                                        
001527       *-------------------------------------------------------*         
001528       *  2000-PROCESS                                         *         
001529       *-------------------------------------------------------*         
001530        2000-PROCESS.                                                    
001540            EVALUATE TRUE                                                
001550              WHEN EIBCALEN = ZERO                                       
001560                MOVE LOW-VALUE TO TMAP010                                
001570                SET SEND-IND-ERASE TO TRUE                               
001580                PERFORM 2000-10-SEND                                     
001590              WHEN EIBAID = DFHCLEAR                                     
001600                MOVE LOW-VALUE TO TMAP010                                
001700                SET SEND-IND-ERASE TO TRUE                               
001800                PERFORM 2000-10-SEND                                     
001900              WHEN EIBAID = DFHPA1 OR DFHPA2 OR DFHPA3                   
002000                CONTINUE                                                 
002100              WHEN EIBAID = DFHPF3                                       
002200                 EXEC CICS RETURN                                        
002300                END-EXEC                                                 
002400                GOBACK                                                   
002500              WHEN EIBAID = DFHENTER                                     
002600                PERFORM 2000-00-PROCESS                     
002610              WHEN OTHER                                                 
002611                MOVE LOW-VALUE TO TMAP010                                
002612                MOVE 'WRONG KEY' TO MSGLINE0                             
002613                SET SEND-IND-ALARM TO TRUE                               
002620                PERFORM 2000-10-SEND                                     
002630            END-EVALUATE.                                                
002690       *                                                                 
002691            EXEC CICS TRTURN TRANSID('ABCD')                             
002692                COMMAREA(COMMUNICATION-AREA)                             
002693            END-EXEC.                                                    
002694            GOBACK.                                                      
002695       *                                                                 
002696        2000-00-PROCESS.                                                 
002697            EXEC CICS RECEIVE MAP('TMAP01')                              
002698                              MAPSET('TMAPSET')                          
002699                              INTO(TMAP011)                              
002700            END-EXEC.                                                    
002701            IF DPTONOL = ZERO OR DPTONOI = SPACE                         
002702               MOVE 'N' TO DATA-IS                                       
002703               MOVE 'ENTER A VALID DEPARTMENT NUMBER' TO MSGLINEO        
002704            END-IF.                                                      
002705            IF DATA-IS-O                                                 
002706               MOVE DPTONOI TO WORKDEPT-HV                               
002707               PERFORM 2000-01-DB2                                       
002708            END-IF.                                                      
002709            IF DATA-IS-O                                                 
002710               SET SEND-IND-DATAO TO TRUE                                
002711               PERFORM 2000-10-SEND                                      
002712            ELSE                                                         
002713               SET SEND-IND-ALARM TO TRUE                                
002714               PERFORM 2000-10-SEND                                      
002715            END-IF.                                                      
002716       *                                                                 
002717        2000-01-DB2.                                                     
002718            EXEC SQL  SELECT CHAR(DECIMAL(SUM(SALARY),9,2))              
002719                 INTO : SALARY-HV:SALARY-IN                              
002720                 FROM DSN8810.EMP                                        
002721                 WHERE WORKDEPT=:WORKDEPT-HV                             
002722            END-EXEC.                                                    
002723            IF SQLCODE = ZERO                                            
002724            THEN                                                         
002725              IF SALARY-IN = -1                                          
002726              THEN                                                       
002727                MOVE 'N' TO DATA-IS                                      
002728                MOVE 'NO EMPLOYEES EXIST IN THIS DEPARTMENT' TO MSGLINEO 
002729                MOVE SPACES TO AVGSALO                                   
002730              ELSE                                                       
002731                MOVE SALARY-HV TO AVGSALO                                
002732                MOVE SPACES TO MSGLINEO                                  
002733              END-IF                                                     
002734            ELSE                                                         
002735               MOVE '0' TO DATA-IS                                       
002736               MOVE SPACES TO AVGSALO                                    
002737               MOVE 'SQLSTATE' TO MSGSQLC                                
002738               MOVE SQLSTATE TO MSGREST                                  
002739               MOVE MSGLINET TO MSGLINEO                                 
002740            END-IF.                                                      
002748       *                                                                 
002749        2000-10-SEND.                                                    
002750       *                                                                 
002751            EVALUATE TRUE                                                
002752            WHEN SEND-IND-ERASE                                          
002753              EXEC CICS SEND MAP('TMAP01')                               
002754                MAPSET('TMAPSET')                                        
002755                FROM (TMAP010)                                           
002756                ERASE                                                    
002757              END-EXEC                                                   
002758            WHEN SEND-IND-DATA0                                          
002759              EXEC CICS SEND MAP('TMAP01')                               
002760                MAPSET('TMAPSET')                                        
002761                FROM (TMAP010)                                           
002762                DATAONLY                                                 
002763              END-EXEC                                                   
002764            WHEN SEND-IND-ALARM                                          
002765              EXEC CICS SEND MAP('TMAP01')                               
002766                MAPSET('TMAPSET')                                        
002767                FROM (TMAP010)                                           
002768                DATAONLY                                                 
002769                ALARM                                                    
002770              END-EXEC                                                   
002771            END-EVALUATE.                                                
002774       *                                                                 
****** **************************** Bottom of Data ****************************                             