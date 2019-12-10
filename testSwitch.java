import java.util.*;
public class testSwitch{
	
    
    public static void main(String args[]){
        //testSwitch obj = new testSwitch();
        
        int sub1,sub2,sub3,scoreGrade1,scoreGrade2,scoreGrade3,creditSub1,creditSub2,creditSub3;
        String subName1,subName2,subName3;
        char grade1,grade2,grade3;
        double gpa,totalCredit,totalScore;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Name of Subject 1 :");
        subName1 = scan.next();
        System.out.print("Enter Credit of Subject 1 :");
        creditSub1 = scan.nextInt();
        System.out.print("Enter Score of Subject 1 :");
        sub1 = scan.nextInt();


        System.out.print("Enter Name of Subject 2 :");
        subName2 = scan.next();
        System.out.print("Enter Credit of Subject 2 :");
        creditSub2 = scan.nextInt();
        System.out.print("Enter Score of Subject 2 :");
        sub2 = scan.nextInt();
        
        System.out.print("Enter Name of Subject 3 :");
        subName3 = scan.next();
        System.out.print("Enter Credit of Subject 3 :");
        creditSub3 = scan.nextInt();
        System.out.print("Enter Score of Subject 3 :");
        sub3 = scan.nextInt();
          
        System.out.print("Subject 1 is "+subName1+"|Score is "+sub1);
        //System.out.print(obj.setGrade(obj.sub1));
        grade1 = setGrade(sub1);
        scoreGrade1 = setScoreGrade(grade1);
        checkGrade(grade1);
        
        System.out.print("Subject 2 is "+subName2+"|Score is "+sub2);
        //System.out.print(obj.setGrade(obj.sub2));
        grade2 = setGrade(sub2);
        scoreGrade2 = setScoreGrade(grade2);
        checkGrade(grade2);
        
        System.out.print("Subject 3 is "+subName3+"|Score is "+sub3);
        //System.out.print(obj.setGrade(obj.sub3));
        grade3 = setGrade(sub3);
        scoreGrade3 = setScoreGrade(grade3);
        checkGrade(grade3);
        
        totalCredit = creditSub1+creditSub2+creditSub3;
        totalScore = (creditSub1*scoreGrade1)+(creditSub2*scoreGrade2)+(creditSub3*scoreGrade3);
        gpa = totalScore/totalCredit;
        System.out.println("GPA = "+String.format("%.2f",gpa));
        
    }
    public static char setGrade(int score){
    	char grade;
    	if(score >= 80 ){
    		grade = 'A';
        }else if(score >= 70 ){
        	grade = 'B';
        }else if(score >= 60 ){
        	grade= 'C';
        }else if(score >= 50 ){
        	grade= 'D';
        }else 
        	grade ='F';	
    	return grade;
    }
    public static int setScoreGrade(char grade){
    	int scoreGrade;
    	switch(grade){
    	case 'A':
        	scoreGrade = 4;
        	break;
        case 'B':
        	scoreGrade = 3;
        	break;
        case 'C':
        	scoreGrade = 2;
        	break;
        case 'D':
        	scoreGrade = 1;
        	break;
        default:
        	scoreGrade = 0;
        	break;
    	}
    	return scoreGrade;
    }

    public static void checkGrade(char grade){
    	switch(grade){
        case 'A':
        	System.out.println("|Score of A : 80 - 100");
        	break;
        case 'B':
        	System.out.println("|Score of B : 70 - 79");
        	break;
        case 'C':
        	System.out.println("|Score of C : 60 - 69");
        	break;
        case 'D':
        	System.out.println("|Score of D : 50 - 59");
        	break;
        default:
        	System.out.println("|Score of F : 0 - 49");
        	break;
        }
    }
}