import java.rmi.server.ExportException;
import java.util.Scanner;

public class Task {
    private static void me(){
        System.out.println("name: Amir Mohamed Elsagan");
        System.out.println("im now in full time student in Microverse");
        System.out.println("im a full stack developer i use ASP.net 5 in backend and React in front end");
        System.out.println("Addres: Tanta - Egypt");
        System.out.println("Programming Skills: JavaScript/TypeScript, Python, C#, C++, SQL");
        System.out.println("Other: Git, ReactJS, Redux/Flux, HTML, CSS/Bootstrap, Jest, Apache Spark, MapReduce, Scikit-learn, Azure.");
        System.out.println("Soft Skills: Problem-solving, can collaborate with a team, and time management. ");

        return;
    }
    public static void edu(){
        System.out.println("Bachelor of Science, Computer Science. GPA: 3.1 ");
        System.out.println("Expected Graduation: May 2025");
        System.out.println("Courses: Data Structures & Algorithms, C++ Program Design, Big Data Analytics");
        System.out.println("Activities: FCI helpers – I help over 800 students with college courses.");
    }
    private static void contact(){
        System.out.println("Phone: +201116338319");
        System.out.println("LinkedIn: https://www.linkedin.com/in/amir-elsagan-543098208/");
        System.out.println("GitHup: https://github.com/Amirosagan");
        System.out.println("Email: mailto:sagan.5050@gmail.com");
    }

    private static void exper(){
        System.out.println("1- NTI ML 20days");
        System.out.println("i learned python programring language and some librares for math like numpy");
        System.out.println("and learn tenser flow library in ML and sklearn");
        System.out.println("and bulid some basic ML modles");
        System.out.println();
        System.out.println("2- Microverse full stack");
        System.out.println("im now a full time remote student in this compony ");
        System.out.println("i learn React js and redux");
        System.out.println("and in back end lean ruby languge and on realise frame work");
        System.out.println("this compony get me a lot real work experience to git remote jop");
    }

    private static void proj() {
        System.out.println("1- Baking API");
        System.out.println("I'm developed this API without any help from anyone and made it the first project in SAAS (software as a Service)");
        System.out.println("Implemented with ASP.net framework and I used RESTful design pattern and clean code with DRAY and SOLID.");
        System.out.println("2- Notes App");
        System.out.println("I'm developed this with React js and use a talwindCss to reduce some time");
        System.out.println("i Implement two theme one light theme another is dark theme and can save your notes in local storage");

        System.out.println();
        System.out.println("for Another projects in GetHup: https://github.com/Amirosagan");
    }


    public static void main(String[] args) {
            System.out.println("hi my name is Amir Elsagan");
            System.out.println("this program for git all information of me");
            System.out.println("whats you want know about me");
            try (Scanner input = new Scanner(System.in)) {
                String[] arr = {"Me" , "Contact" ,"Education", "Experience" , "some Projects"};
                while(true) {
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println((i+1) + "_ " + arr[i]);
                    }
                    System.out.println("chose from this choses (if you want exit Ctrl+C )");    
                    int cho = input.nextInt();
                    System.out.println("--------------------------------");
                    switch(cho) {
                        case 1: 
                            me();
                            break;
                        case 2: 
                            contact();
                            break;
                        case 3: 
                            edu();
                            break;
                        case 4: 
                            exper();
                            break;
                        case 5:
                            proj();
                            break;
                        default:
                            throw new ExportException("should you enter (1 , 2 , 3 ,4)");
                    }
                    System.out.println("--------------------------------");
                    input.next();
                }
            }catch (Exception e) {
                System.out.println(e);
            }
            
    }
}
