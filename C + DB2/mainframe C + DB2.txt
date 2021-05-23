/*---------------------------------------------------*/         
/* M A I N F R A M E ( C + D B 2 )     P R O G R A M */         
/*---------------------------------------------------*/         
#include <stdio.h>                                              
#include <stdlib.h>                                             
#include <string.h>                                             
                                                                
EXEC SQL INCLUDE SQLCA;                                         
                                                                
EXEC SQL                                                        
  DECLARE EMP TABLE                                             
  (EMPNO        CHAR(6)      NOT NULL,                          
   FIRSTNAME    VARCHAR(12)  NOT NULL,                          
   MIDINIT      CHAR(1)      NOT NULL,                          
   LASTNAME     VARCHAR(15)  NOT NULL,                          
   WORKDEPT     CHAR(3)              ,  
   PHONENO      CHAR(4)              ,        
   HIREDATE     DATE                 ,        
   JOB          CHAR(8)              ,        
   EDLEVEL      SMALLINT             ,        
   SEX          CHAR(1)              ,        
   BIRTHDATE    DATE                 ,        
   SALARY       DECIMAL(9,2)         ,        
   BONUS        DECIMAL(9,2)         ,        
   COMM         DECIMAL(9,2)         );       
                                              
EXEC SQL BEGIN DECLARE SECTION;               
  long sum;                                   
  long count;                                 
  char deptno[4];                             
EXEC SQL BEGIN DECLARE SECTION;               
 
int avg-sal(char*);                                               
int record-read(FILE*,char*);                                     
                                                                  
void main()                                                       
{                                                                 
  FILE* cardin; /* for DD card CARDIN */                          
  int avgsal;                                                     
  char dept[4];                                                   
  cardin = fopen("DD:CARDIN","rb,recfm=FB,lrecl=80,type=record"); 
  if(cardin == NULL)                                              
  {                                                               
    printf("Error opening DD CARDIN\n");                          
    exit(-2);                                                     
  }                                                               

  while(record_read(cardin,dept)!=0)                                
  {                                                                 
     avgsal = avg_sal(dept);                                         
     if(avgsal > 0)                                                  
       printf("Average salary of %s is %d\n",dept, avgsal);          
  }                                                                 
  fclose(cardin);                                                   
}                                                                   
                                                                     
int avg_sal(char* dept)                                             
{                                                                   
   int avgsal;                                                        
   count = 0;                                                         
   strncpy(deptno,dept,3);                                            
   deptno[3] = 0;                                                     
                                                                       
   EXEC SQL SELECT SUM(SALARY), COUNT(*) INTO :sum, :count            
             FROM P390.EMP                                             
             WHERE WORKDEPT = :deptno;                                 
                                                                       
   if(count !=0 )                                                     
   {                                                                  
      avgsal = sum/count;                                              
      return avgsal;                                                   
   }else                                                             
   {
      printf("DEPT %s does not exist \n", deptno);                      
      return -1;                                                        
   }                                                                   
}                                                                      
                                                                        
int record_read(FILE* file, char* dept)                             
{                                                                   
   int readbytes;                                                    
   char linebuf[81],linebuf2[80];                                    
   readbytes = fread(linebuf,1,81,file);                             
   strncpy(dept,linebuf,3);                                          
   dept[3]=0;                                                        
   return readbytes;                                                 
}                       