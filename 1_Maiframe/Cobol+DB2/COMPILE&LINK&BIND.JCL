****** ***************************** Top of Data ******************************
000001 //DB2CMPLK JOB (),'P390',CLASS=A,MSGCLASS=X,MSGLEVEL=(1,1),             
000002 // NOTIFY=&SYSUID                                                       
000003 //JOBLIB  DD  DSN=DSN810.SDSNLOAD,DISP=SHR                              
000004 //        DD  DSN=DSN810.SDSNEXIT,DISP=SHR                              
000005 //*--------------------------------------------------------------       
000006 //* JOB TO PRECOMPILE AND COMPILE AND LINK-EDIT COBOL FOR DB2           
000007 //*--------------------------------------------------------------       
000008 //PC    EXEC PGM=DSNHPC,PARM='HOST(COB2),SOURCE',REGION=4096K           
000009 //DBRMLIB  DD DSN=COBOL.TEST.DB2.DBRM(CUSTINFQ),DISP=SHR                
000010 //SYSCIN   DD DSN=&&DSNHOUT,DISP=(MOD,PASS),UNIT=SYSDA,                 
000011 //            SPACE=(800,(500,500))                                     
000012 //SYSLIB   DD DISP=SHR,DSN=COBOL.TEST.DB2.COPYBOOK                      
000013 //SYSIN    DD DSN=COBOLLIB.TEST.NEW.SOURCE(CUSTINFQ),DISP=SHR           
000014 //SYSPRINT DD SYSOUT=*                                                  
000015 //SYSTERM  DD SYSOUT=*                                                  
000016 //SYSUDUMP DD SYSOUT=*                                                  
000017 //SYSUT1   DD SPACE=(800,(500,500),,,ROUND),UNIT=SYSDA                  
000018 //SYSUT2   DD SPACE=(800,(500,500),,,ROUND),UNIT=SYSDA                  
000019 //*                                                                     
000020 //* COMPILE THE COBOL PROGRAM IF THE PRECOMPILE                         
000021 //* RETURN CODE IS 4 OR LESS                                            
000022 //*                                                                     
000023 //COBOL  EXEC PGM=IGYCRCTL,REGION=2048K,COND=(4,LT,PC)                  
000024 //STEPLIB  DD  DSNAME=IGY330.SIGYCOMP,                                  
000025 //             DISP=SHR                                                 
000026 //SYSPRINT DD  SYSOUT=*                                                 
000027 //SYSIN    DD  DSN=&&DSNHOUT,DISP=(OLD,DELETE)                          
000028 //SYSLIN   DD  DSNAME=&&LOADSET,UNIT=SYSDA,                             
000029 //             DISP=(MOD,PASS),SPACE=(TRK,(3,3)),                       
000030 //             DCB=(BLKSIZE=3200)                                       
000031 //SYSIN    DD  DSN=COBOLLIB.TEST.NEW.SOURCE(CUSTINFQ),                  
000032 //             DISP=SHR                                                 
000033 //SYSLIB   DD  DSN=COBOL.TEST.DB2.COPYBOOK,                             
000034 //             DISP=SHR                                                 
000035 //SYSUT1   DD  UNIT=SYSDA,SPACE=(CYL,(1,1))                             
000036 //SYSUT2   DD  UNIT=SYSDA,SPACE=(CYL,(1,1))                             
000037 //SYSUT3   DD  UNIT=SYSDA,SPACE=(CYL,(1,1))                             
000038 //SYSUT4   DD  UNIT=SYSDA,SPACE=(CYL,(1,1))                             
000039 //SYSUT5   DD  UNIT=SYSDA,SPACE=(CYL,(1,1))                             
000040 //SYSUT6   DD  UNIT=SYSDA,SPACE=(CYL,(1,1))                             
000041 //SYSUT7   DD  UNIT=SYSDA,SPACE=(CYL,(1,1))                             
000042 //*                                                                     
000043 //* LINKEDIT IF THE PRECOMPILE AND COMPILE                              
000044 //* RETURN CODE IS 4 OR LESS                                            
000045 //*                                                                     
000046 //LKED   EXEC PGM=IEWL,COND=(4,LT,COBOL),REGION=1024K,                  
000047 //         PARM='XREF'                                                  
000048 //SYSLIB   DD  DSN=CEE.SCEELKED,DISP=SHR                                
000049 //         DD  DSN=DSN810.SDSNLOAD,DISP=SHR                             
000050 //         DD  DSN=COBOL.TEST.DB2.COPYBOOK,DISP=SHR                     
000051 //SYSLIN   DD  DSNAME=&&LOADSET,DISP=(OLD,DELETE)                       
000052 //*        DD  DDNAME=SYSIN  
000053 //SYSPRINT DD  SYSOUT=*                                                 
000054 //SYSUDUMP DD  SYSOUT=*                                                 
000055 //SYSLMOD  DD  DSNAME=COBOLLIB.TEST.NEW.LOAD(CUSTINFQ),                 
000056 //             SPACE=(TRK,(10,10,1)),                                   
000057 //             UNIT=SYSDA,DISP=(MOD,PASS)                               
000058 //SYSUT1   DD  UNIT=SYSDA,SPACE=(TRK,(10,10))                           
000059 //SYSIN    DD *                                                         
000060      NAME CUSTINFQ(R)                                                   
000061 /*                                                                      
000062 //**                                                                    
000063 //BIND  EXEC PGM=IKJEFT01,DYNAMNBR=20,COND=(4,LT)                       
000064 //DBRMLIB   DD  DSN=COBOL.TEST.DB2.DBRM,DISP=SHR                        
000065 //SYSTSPRT  DD  SYSOUT=*                                                
000066 //SYSPRINT  DD  SYSOUT=*                                                
000067 //SYSPRINT  DD  SYSOUT=*                                                
000068 //SYSUDUMP  DD  SYSOUT=*                                                
000069 //SYSOUT    DD  SYSOUT=*                                                
000070 //SYSIN     DD *                                                        
000071 /*                                                                      
000072 //SYSTSIN   DD *                                                        
000073   DSN SYSTEM(DB7G)                                                      
000074   BIND MEMBER      (CUSTINFQ) -                                         
000075        PACKAGE     (DB7G)  -                                            
000076        ACTION      (REP) -                                              
000077        ISOLATION   (CS)  -                                              
000078        VALIDATE    (BIND) -                                             
000079        RELEASE     (COMMIT) -                                           
000080        OWNER       (P390) -                                             
000081        QUALIFIER   (DEVQUALI)                                                                                      