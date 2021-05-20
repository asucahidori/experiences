000100        IDENTIFICATION                  DIVISION.     
000200        PROGRAM-ID.                     CUSTINFQ.     
000400       *                                              
000500        ENVIRONMENT                     DIVISION.     
000600       *                                              
000700        DATA                            DIVISION.     
000710       *                                              
000711        FILE                            SECTION.      
000720       *                                              
000800        WORKING-STORAGE                 SECTION.      
000801       *                                              
000802        01  SWITCHES.                                 
000803            05 END-OF-INQUIRIES-SW PIC X   VALUE 'N'. 
000804               88 END-OF-INQUIRIES         VALUE 'Y'. 
000805            05 CUSTINFO-FOUND-SW   PIC X.             
000806               88 CUSTINFO-FOUND           VALUE 'Y'. 
000807       *                                              
000808            EXEC SQL                                               
000809              INCLUDE CUSTINFQ                                     
000810            END-EXEC.                                              
000811       *                                                           
000812            EXEC SQL                                               
000813              INCLUDE SQLCA                                        
000814            END-EXEC.                                              
001430       *                                                           
001500        PROCEDURE                       DIVISION.                  
001510        000-DISPLAY-CUSTINFO-ROWS.                                 
001520            PERFORM 100-DISPLAY-CUSTINFO-ROW                       
001530              UNTIL END-OF-INQUIRIES.                              
001540            STOP RUN                                               
001550            .                                                      
001560        100-DISPLAY-CUSTINFO-ROW.                                  
001570            PERFORM 110-ACCEPT-CUSTINFO-ID.                        
001580            IF NOT END-OF-INQUIRIES                                
001590              MOVE 'Y' TO CUSTINFO-FOUND-SW 
001591              PERFORM 120-GET-CUSTINFO-ROW                          
001592              IF CUSTINFO-FOUND                                     
001593                 PERFORM 130-DISPLAY-CUSTINFO-LINES                 
001594              ELSE                                                  
001595                 PERFORM 140-DISPLAY-ERROR-LINES                    
001596              END-IF                                                
001597             END-IF                                                 
001600             .                                                      
001700        110-ACCEPT-CUSTINFO-ID.                                     
001710            DISPLAY '-------------------------------------------'.  
001720            DISPLAY 'KEY IN THE NEXT CUSTIDC IN AND PRESS ENTER'.   
001730            DISPLAY 'OR KEY IN 999999999999 AND ENTER TO QUIT.'.    
001740            ACCEPT CUSTIDC.                                         
001750            IF CUSTIDC = '99999999999999'                           
001760              MOVE 'Y' TO END-OF-INQUIRIES-SW                       
001770            END-IF                                                  
001780            .                                                       
001790        120-GET-CUSTINFO-ROW.                                       
001791            EXEC SQL                                                  
001792              SELECT CUSTIDC,   CUSTNAME,   CUSTSEX,                  
001793                     CUSTADDR,  CUSTCITY,   CUSTTEL,                  
001794                     ZIPCODE                                          
001795              INTO :CUSTIDC,  :CUSTNAME,  :CUSTSEX,                   
001796                   :CUSTADDR, :CUSTCITY,  :CUSTTEL,                   
001797                   :ZIPCODE                                           
001798              FROM  P390.CUSTINFO                                     
001799                 WHERE CUSTIDC = :CUSTIDC                             
001800            END-EXEC.                                                 
001801       *                                                              
002200            IF SQLCODE NOT = 0                                        
002300              DISPLAY 'SQLCODE= ' SQLCODE                             
002310              MOVE 'N' TO CUSTINFO-FOUND-SW.                          
002500            .                                                         
002501       *                                                              
002510        130-DISPLAY-CUSTINFO-LINES.                                   
002511       *                                                              
002512            DISPLAY '-------------------------------------------'.       
002513            DISPLAY '  CUSTINFO ' CUSTIDC.                               
002514            DISPLAY '  NAME     ' CUSTNAME ' '  CUSTSEX.                 
002515            DISPLAY '  ADDRESS  ' CUSTADDR.                              
002516            DISPLAY '  CUSTCITY ' CUSTCITY .                             
002600       *                                                                 
002700        140-DISPLAY-ERROR-LINES.                                         
002800       *                                                                 
002900            DISPLAY '-------------------------------------------'.       
003000            DISPLAY '  CUSTINFO ID ' CUSTIDC ' NOT FOUND.'.              
003500       *                                                                 
****** **************************** Bottom of Data ****************************







                       