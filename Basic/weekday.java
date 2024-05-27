public class weekday {
    public static void main(String args[])
    {
            System.out.println("Enter the number between 1-7: ");
            if(args.length <1){
                System.out.println("Please enter only one number:" );
                return;
            }

            int number= Integer.parseInt(args[0]);
            switch (number) {
                    case 1:
                        System.out.println("monday");
                        break;
                    case 2:
                    System.out.println("tuesday");
                    break;
        
                    case 3:
                    System.out.println("wednesday");
                    break;
        
                    case 4:
                    System.out.println("thursday");
                    break;
        
                    case 5:
                    System.out.println("friday");
                    break;
        
                    case 6:
                    System.out.println("saturday");
                    break;
        
                    case 7:
                    System.out.println("sunday");
                    break;
                    default:
                    System.out.println("itna nahi hota55");
                        break;
                }
    }
    
}
