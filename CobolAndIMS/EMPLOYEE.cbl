****** ***************************** Top of Data ******************************
=COLS> ----+----1----+----2----+----3----+----4----+----5----+----6----+----7--
000010       /********************************************************         
000011       /* C O B O L - I M S                                              
000020       /********************************************************         
000100        IDENTIFICATION                  DIVISION.                        
000200        PROGRAM-ID.                     EMPLOYEE.                        
000300        AUTHOR.                         LEE.                             
000400       *                                                                 
000500        ENVIRONMENT                     DIVISION.                        
000501       *CONFIGURATION                   SECTION.                         
000502       *SOURCE-COMPUTER                 IBM-390.                         
000510        INPUT-OUTPUT                    SECTION.                         
000520        FILE-CONTROL.                                                    
000530            SELECT 100-INPUT-FILE ASSIGN TO UT-S-INPUT.                  
000600       *                                                                 
000700        DATA                            DIVISION.                        
000710       *                                                                 
000711        FILE                            SECTION.                         
000712       *                                                                 
000713        FD  100-INPUT-FILE                                               
000715            RECORDING MODE IS F                                          
000716            LABEL RECORDS ARE STANDARD                                   
000718            BLOCK CONTAINS 0 RECORDS.                                    
000719       *                                                                 
000720        01 100-INPUT-FILE-REC           PIC X(70).                       
000730       *                                                                 
000800        WORKING-STORAGE                 SECTION.                         
000801       *------------------------------------------------------------     
000802       ** WORK STORAGE SECTION                                           
000803       *------------------------------------------------------------     
000805       * IMS API                                                         
000806        01 IMS-FUNCTION-CALLS.                                           
000807           03 FUNC-GU             PIC X(04)  VALUE 'GU  '.               
000808           03 FUNC-GN             PIC X(04)  VALUE 'GN  '.               
000809           03 FUNC-GNP            PIC X(04)  VALUE 'GNP '.               
000810           03 FUNC-GHU            PIC X(04)  VALUE 'GHU '.               
000811           03 FUNC-GHN            PIC X(04)  VALUE 'GHN '.               
000820           03 FUNC-GHNP           PIC X(04)  VALUE 'GHNP'.               
000830           03 FUNC-ISRT           PIC X(04)  VALUE 'ISRT'.               
000840           03 FUNC-DLET           PIC X(04)  VALUE 'DLET'.               
000850           03 FUNC-REPL           PIC X(04)  VALUE 'REPL'.               
001400       * ERROR MESSAGES                                                  
001410        01 100-ERROR-MESSAGE.                                            
001420           05                     PIC X(15)  VALUE 'IMS ERR,STATUS='.    
001430           05  100-ERROR-STATUS   PIC X(02)  VALUE SPACE.                
001431           05                     PIC X(04)  VALUE ',DB='.               
001432           05  100-ERROR-DB       PIC X(08)  VALUE SPACE.                
001433           05                     PIC X(09)  VALUE ',FB-NAME='.          
001434           05  100-ERROR-FB       PIC X(08)  VALUE SPACES.               
001440       *                                                                 
001441       * SSA - SEARCH SEGMENT AUGUMENTS FOR EMPLOYEE DATABASE.           
001442       * SSA FOR EMPLOYE ROOT SEGMENT                                    
001443       *                                                                 
001444        01 200-EMPLOYEE-SSA.                                             
001445           05 200-SEGM-NAME       PIC X(08)  VALUE 'EMPLSEG'.            
001446           05 200-COMMENT         PIC X(01)  VALUE '*'.                  
001447           05 200-COMMAND-CODE1   PIC X(01)  VALUE '-'.                  
001448           05 200-COMMAND-CODE2   PIC X(01)  VALUE '-'.                  
001449           05 200-BEGIN-LP        PIC X(01)  VALUE '('.                  
001450           05 200-SEGM-KEYNM      PIC X(01)  VALUE 'FRKEY'.              
001451           05 200-REL-OPER        PIC X(01)  VALUE '='.                  
001452           05 200-SEGM-KEY        PIC X(01)  VALUE SPACES.               
001453           05 200-END-RP          PIC X(01)  VALUE ')'.                  
001454       *                                                                 
001455       * SSA FOR EDUCATION SEGMENT                                       
001456       *                                                                 
001457        01 210-EDUCATION-SSA.                                            
001458           05 210-SEGM-NAME       PIC X(08)  VALUE 'EDUCSEG'.            
001459           05                     PIC X(01)  VALUE '*'.                  
001460           05 210-COMMAND-CODE1   PIC X(01)  VALUE '-'.                  
001461           05 210-COMMAND-CODE2   PIC X(01)  VALUE '-'.                  
001462           05 210-BEGIN-LP        PIC X(01)  VALUE '('.                  
001463           05 210-SEGM-KEYNM      PIC X(01)  VALUE 'FDKEY'.              
001464           05 210-REL-OPER        PIC X(01)  VALUE '='.                  
001465           05 210-SEGM-KEY        PIC X(01)  VALUE SPACES.               
001466           05 210-END-RP          PIC X(01)  VALUE ')'.                  
001467       *                                                                 
001468       * I/O AREA - USED TO HOLD DATA PASSED TO AND FROM THE DB          
001469       *                                                                 
001470        01 SEGMENT-IO-AREA.                                              
001471           05 EMPLOYEE-SEGMENT-IO-AREA.                                  
001472              10 EMPLOYEE-NUM   PIC X(06) VALUE SPACES.                  
001473              10 LAST-NAME      PIC X(10) VALUE SPACES.                  
001474              10 FIRST-NAME     PIC X(06) VALUE SPACES.                  
001475              10 EMPLOYEE-SSN   PIC X(09) VALUE SPACES.                  
001476           05 EDUCATION-SEGMENT-IO-AREA.                                 
001477              10 EDUCATION-CODE PIC X(02) VALUE SPACES.                  
001478              10 SCHOOL-NAME    PIC X(08) VALUE SPACES.                  
001480              10 SCHOOL-DEGREE  PIC X(05) VALUE SPACES.                  
001481       *                                                                 
001482       *                                                                 
001483       * INPUT FILE HOLD AREA                                            
001484       *                                                                 
001485        01 400-INPUT-FILE-AREA.                                          
001486           05 400-DATABASE-FUNCTION    PIC X(08)  VALUE SPACES.          
001487           05 400-ROOT-FUNCTION        PIC X(08)  VALUE SPACES.          
001488           05 400-EMPLOYEE-NUM         PIC X(06)  VALUE SPACES.          
001489           05 400-EMPLOYEE-LAST-NAME   PIC X(10)  VALUE SPACES.          
001490           05 400-EMPLOYEE-FIRST-NAME  PIC X(06)  VALUE SPACES.          
001491           05 400-EMPLOYEE-SSN         PIC X(09)  VALUE SPACES.          
001492           05 400-EDUC-FUNCTION        PIC X(08)  VALUE SPACES.          
001493           05 400-EDUC-CODE            PIC X(02)  VALUE SPACES.          
001494           05 400-EDUC-SCHOOL          PIC X(08)  VALUE SPACES.          
001495           05 400-EDUC-DEGREE          PIC X(05)  VALUE SPACES.          
001496       *                                                                 
001497        01 500-HOLD-AREA.                                                
001498           05 500-END-OF-FILE          PIC X(01)  VALUE 'N'.             
001499           05 500-IMS-ERROR            PIC X(01)  VALUE 'N'.             
001500       *------------------------------------------------------------     
001501       ***  LINKAGE SECTION                                              
001503       *------------------------------------------------------------     
001504        LINKAGE SECTION.                                                 
001505       *                                                                 
001506       * PCB MASK FOR THE DATABASE DEFINED IN OUR PSB.                   
001507       *                                                                 
001508        01 EMPLOYEE-DB-PCB-MASK.                                         
001509           05 PCB-DBD-NAME             PIC X(08).                        
001510           05 PCB-SEG-LEVEL            PIC X(08).                        
001511           05 PCB-DBD-NAME             PIC X(08).                        
001512           05 PCB-DBD-NAME             PIC X(08).                        
001513           05 PCB-DBD-NAME             PIC X(08).                        
001514           05 PCB-DBD-NAME             PIC X(08).                        
001515           05 PCB-DBD-NAME             PIC X(08).                        
001516           05 PCB-DBD-NAME             PIC X(08).                        
001517           05 PCB-DBD-NAME             PIC X(08).                        
001518       *-------------------------------------------------------*         
001519       *** PROCEDURE             DIVISION.                               
001520       *-------------------------------------------------------*         
001521       *                                                                 
001522        PROCEDURE             DIVISION.                                  
001523        A000-MAIN-PROCESS.                                               
001524            ENTRY 'DLITCBL' USING EMPLOYEE-DB-PCB-MASK.                  
001525            PERFORM A000-INITIALIZE.                                     
001526            PERFORM B000-PROCESS-RECORD                                  
001527              UNTIL 500-END-OF-FILE = 'Y' OR                             
001528                    500-IMS-ERROR   = 'Y'                                
001529            END-PERFORM.                                                 
001530            CLOSE 100-INPUT-FILE                                         
001531            GOBACK.                                                      
002690       *                                                                 
002691        A000-INITIALIZE.                                                 
002692            OPEN INPUT  100-INPUT-FILE.                                  
002693            PERFORM U100-READ-INPUT-FILE.                                
002694            IF 500-END-OF-FILE = 'Y'                                     
002695               DISPLAY 'ERROR-INPUT FILE IS EMPTY'                       
002696            END-IF.                                                      
002703       *                                                                 
002704        B000-PROCESS-RECORD.                                             
002705       *                                                                 
002706            EVALUATE 400-DATABASE-FUNCTION                               
002707              WHEN 'INQUIRY'                                             
002708                PERFORM C000-INQUIRY-EMPLOYEE                            
002709              WHEN 'UPDATE'                                              
002710                PERFORM C100-UPDATE-EMPLOYEE                             
002711            END-EVALUATE                                                 
002712            PERFORM U100-READ-INPUT-FILE                                 
002715            .                                                            
002716       *                                                                 
002717       *------------------------------------------------------------     
002718       ***  DATA PROCESSING                                              
002719       *------------------------------------------------------------     
002720       *                                                                 
002721        C000-INQUIRY-EMPLOYEE.                                           
002722            MOVE 400-EMPLOYEE-NUM TO 200-SEGM-KEY                        
002723            CALL 'CBLTDLI' USING FUNC-GU                                 
002724                             EMPLOYEE-DB-PCB-MASK                        
002725                             EMPLOYEE-SEGMENT-IO-AREA                    
002726                             200-EMPLOYEE-SSA                            
002727            PERFORM C025-EVALUATE-STATUS-CODE                            
002728            .                                                            
002729       *                                                                 
002730        C100-UPDATE-IMPLOYEE.                                            
002731            MOVE 400-EMPLOYEE-NUM TO 200-SEGM-KEY                        
002732              CALL 'CBLTDLI' USING FUNC-GU                               
002733                             EMPLOYEE-DB-PCB-MASK                        
002734                             EMPLOYEE-SEGMENT-IO-AREA                    
002735                             200-EMPLOYEE-SSA                            
002737            .                                                            
002738            EVALUATE PCB-STATUS-CODE                                     
002739              WHEN SPACES                                                
002740                   EVALUATE 400-ROOT-FUNCTION                            
002741                     WHEN 'DELETE'                                       
002742                       PERFORM D100-DELETE-EMPLOYEE-SEGMENT              
002743                     WHEN OTHER                                          
002744                       DISPLAY 'INVALID 400-ROOT-FUNCTION'               
002745                   END-EVALUATE   
002747              WHEN 'GE'                                                  
002748                   DISPLAY 'EMPLOYEE NOT FOUND'                          
002749                   EVALUATE 400-ROOT-FUNCTION                            
002750                     WHEN 'INSERT'                                       
002751       *               PERFORM D300-INSERT-EMPLOYEE-SEGMENT              
002752                   END-EVALUATE                                          
002753              WHEN OTHER                                                 
002754                   PERFORM C075-INQUIRY-ERROR                            
002755            END-EVALUATE                                                 
002756            .                                                            
002757       *                                                                 
002758        C025-EVALUATE-STATUS-CODE.                                       
002759            EVALUATE PCB-STATUS-CODE                                     
002760                WHEN SPACES                                              
002761                 DISPLAY 'EMPLOYEE SEGMENT' = 'EMPLOYEE-SEGMENT-IO-AREA  
002762                    PERFORM C050-INQUIRY-EDUCATION-SEGMENT               
002763                WHEN 'GE'                                                
002764                 DISPLAY 'EMPLOYEE NOT FOUND FOR ' 400-EMPLOYEE-NUM      
002765                WHEN OTHER                                               
002766                 PERFORM C075-ENQUIRY-ERROR                              
002767            END-EVALUATE.                                                
002768            .                                                            
002769       *                                                                 
002770        C050-INQUIRY-EDUCATION-SEGMENT.                                  
002771            MOVE SPACE TO 210-BEGIN-LP                                   
002772            PERFORM UNTIL(PCB-STATUS-CODE = 'GE' OR 'GB') OR             
002773                       500-IMS-ERROR='Y'                                 
002774               CALL 'CBLTDLI' USING FUNC-GNP                             
002775                                EMPLOYEE-DB-PCB-MASK                     
002776                                  EDUCATION-SEGMENT-IO-AREA                  
002777                                210-EDUCATION-SSA                        
002778               EVALUATE PCB-STATUS-CODE                                  
002779                 WHEN SPACES                                             
002780                   DISPLAY 'EDUCATION SEGMENT = '                        
002781                   EDUCATION-SEGMENT-IO-AREA                             
002782                 WHEN 'GB'                                               
002783                   WHEN 'GE'                                             
002784                     DISPLAY 'INQUIRY COMPLETE'                          
002785                   WHEN OTHER                                            
002786                     PERFORM C075-INQUIRY-ERROR                          
002787               END-VALUATE                                               
002788            END-PERFORM                                                  
002789            .                                                            
002790       *                                                                 
002791        C075-INQUIRY-ERROR.                                              
002792            PERFORM                                                       
002793                MOVE PC3-STATUS-CODE TO 100-ERROR-STATUS                 
002794                MOVE PCB-DBD-NAME    TO 100-ERROR-DB                     
002795                  MOVE PCB-SEG-NAME  TO 100-ERROR-FB                     
002796                  DISPLAY 100-ERROR-MESSAGE                              
002797                  MOVE 'Y'           TO 500-IMS-ERROR                    
002798            END-PERFORM                                                  
002799            .                                                            
002800       *                                                                 
002801        D100-DELETE-EMPLOYEE-ROOT-SEGMENT.                               
002802            CALL 'CBLTDLI' USING FUNC-DLET                               
002803                           EMPLOYEE-DB-PCB-MASK                          
002804                           EMPLOYEE-SEGMENT-IO-AREA                      
002805            EVALUATE PCB-STATUS-CODE                                     
002806               WHEN SPACES                                               
002807                  DISPLAY 'EMPLOYEE ROOT SEGMENT DELETED'                
002808               WHEN OTHER                                                  
002809                  PERFORM C075-INQUIRY-ERROR                             
002810            END-EVALUATE                                                 
002811            .                                                            
002812                                                                         
002813       *------------------------------------------------------------     
002814       ***  READ INPUT FILE                                              
002815       *------------------------------------------------------------     
002816        U100-READ-INPUT-FILE.                                            
002817            READ 100-INPUT INTO 400-INPUT-FILE-AREA                      
002818              AT END MOVE 'Y' TO 500-EOF-OF-FILE                         
002819            END-READ.                                                    
002820       *                                                                 
002830            END PROGRAM.                                                 
002900       *                                                                 
****** **************************** Bottom of Data ****************************                                