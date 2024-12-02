import java.util.Scanner;

public class Main {
    
    private static final String[][] gameSpecs = {
        {"Fortnite", "Minimum: Intel Core i3, 4GB RAM, Intel HD 4000, 15GB Storage",
         "Recommended: Intel Core i5, 8GB RAM, GTX 660, 20GB Storage",
         "Maximum: Intel Core i7, 16GB RAM, RTX 3080, 25GB Storage"},
        
        {"Call of Duty", "Minimum: Intel Core i3, 8GB RAM, GTX 960, 175GB Storage",
         "Recommended: Intel Core i5, 12GB RAM, GTX 1060, 175GB Storage",
         "Maximum: Intel Core i7, 16GB RAM, RTX 3080, 175GB Storage"},
        
        {"Valorant", "Minimum: Intel Core i3, 4GB RAM, Intel HD 3000, 7GB Storage",
         "Recommended: Intel Core i5, 8GB RAM, GTX 1050, 7GB Storage",
         "Maximum: Intel Core i7, 16GB RAM, RTX 3060, 7GB Storage"},
        
        {"Pubg", "Minimum: Intel Core i5, 8GB RAM, GTX 1060, 30GB Storage",
         "Recommended: Intel Core i7, 16GB RAM, GTX 1660, 30GB Storage",
         "Maximum: Intel Core i9, 32GB RAM, RTX 3080, 30GB Storage"}, 
        
        {"Minecraft", "Minimum: Specs:OS: Windows 7 or later Processor: Intel Core i3-3210 3.2GHz RAM: 4GB Graphics: Intel HD Graphics 4000, Storage: 4GB",
         "Recommended: Specs: OS: Windows 10/11 Processor: Intel Core i5-4690 3.5GHz / AMD A10-7800 3.5GHz RAM: 8GB Graphics: NVIDIA GeForce 700 Series / AMD Radeon Rx 200 Storage: 4GB", 
         "Maximum Specs: OS: Windows 10/11 Processor: Intel Core i7-6700K 4.0GHz RAM: 16GB Graphics: NVIDIA GeForce RTX 3080 Storage: 4GB"},
        
        {"Cyberpunk", "Minimum: OS: Windows 7/10 64-bit Processor: Intel Core i5-3570K / AMD Ryzen 3 3200G RAM: 8GB Graphics: NVIDIA GeForce GTX 780 / AMD Radeon RX 470 Storage: 70GB", 
         "Recommended: OS: Windows 10 64-bit Processor: Intel Core i7-4790 / AMD Ryzen 3 3200G RAM: 12GB Graphics: NVIDIA GeForce GTX 1060 6GB / AMD Radeon RX 590 Storage: 70GB", 
         "Maximum: OS: Windows 10 64-bit Processor: Intel Core i7-9700K / AMD Ryzen 5 3600X RAM: 16GB Graphics: NVIDIA GeForce RTX 3080 Storage: 70GB"},
        
        {"GTA V", "Minimum: OS: Windows 7 64-bit Processor: Intel Core 2 Quad CPU Q6600 @ 2.40GHz / AMD Phenom 9850 Quad-Core Processor RAM: 4GB Graphics: NVIDIA 9800 GT 1GB / ATI HD 4870 1GB Storage: 72GB",
         "Recommended: OS: Windows 10 64-bit Processor: Intel Core i5 3470 @ 3.2GHz / AMD FX-8350 RAM: 8GB Graphics: NVIDIA GTX 660 2GB / AMD HD 7870 2GB Storage: 72GB", 
         "Maximum: OS: Windows 10 64-bit Processor: Intel Core i7-10700K / AMD Ryzen 5 5600X RAM: 16GB Graphics: NVIDIA RTX 3080 / AMD Radeon RX 6800 Storage: 72GB"},
        
        {"Apex Legends", "Minimum: OS: Windows 7 64-bit Processor: Intel Core i3-6300 3.8GHz / AMD FX-4350 4.2GHz Quad-Core Processor RAM: 6GB Graphics: NVIDIA GeForce GT 640 / AMD Radeon HD 7730 Storage: 22GB",
         "Recommended: OS: Windows 7 64-bit Processor: Intel Core i5-3570K 3.4GHz / AMD Ryzen 5 1400 RAM: 8GB Graphics: NVIDIA GeForce GTX 970 / AMD Radeon R9 290 Storage: 22GB", 
         "Maximum: OS: Windows 10 64-bit Processor: Intel Core i7-9700K / AMD Ryzen 7 2700X RAM: 16GB Graphics: NVIDIA GeForce RTX 3080 / AMD Radeon RX 6800 Storage: 22GB"},
        
        {"League of Legends", "Minimum: OS: Windows 7/8/10 Processor: 2.4 GHz Dual-Core Processor RAM: 4GB Graphics: Intel HD 3000 Storage: 16GB",
         "Recommended: OS: Windows 7/8/10 Processor: 3.0 GHz Quad-Core Processor RAM: 8GB Graphics: NVIDIA GeForce 8600/9600GT or ATI/AMD Radeon HD 4000/5000 Storage: 16GB", 
         "Maximum: OS: Windows 7/8/10 Processor: Intel Core i7-6700K 4.0GHz / AMD Ryzen 5 3600 RAM: 16GB Graphics: NVIDIA GeForce GTX 1060 6GB Storage: 16GB"},
        
        {"The Witcher", "Minimum: OS: Windows 7 64-bit Processor: Intel Core i5-2500K / AMD FX-8320 RAM: 6GB Graphics: NVIDIA GeForce GTX 660 / AMD Radeon HD 7870 Storage: 35GB",
         "Recommended: OS: Windows 10 64-bit Processor: Intel Core i7-3770 / AMD Ryzen 3 2200G RAM: 8GB Graphics: NVIDIA GeForce GTX 1060 6GB / AMD Radeon RX 580 8GB Storage: 35GB", 
         "Maximum: OS: Windows 10 64-bit Processor: Intel Core i7-9700K / AMD Ryzen 5 3600 RAM: 16GB Graphics: NVIDIA GeForce RTX 3080 / AMD Radeon RX 6800 Storage: 35GB"},
         {"hidden", "Minimum: if you found this you are the best", "Recomended: if you found this you are the best", "Maximum: if you found this you are the best"}
    };

   
    public static final String GREEN = "\033[0;32m";  
    public static final String RESET = "\033[0m";     

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(GREEN + "Hello, this is your friendly bot that can help you find what PC specs you may need for Fortnite, Valorant, and Call of Duty" + RESET);
        System.out.println(GREEN + "depending on what you want" + RESET);
        
       
        while (true) {
            System.out.print(GREEN + "\nWhat game are you looking for PC specs for? (Type 'stop' to exit): " + RESET);
            String userResp = in.nextLine().trim(); 

            if (userResp.equalsIgnoreCase("stop")) {
                break;  
            }

            System.out.print(GREEN + "What spec level are you interested in? (Minimum, Recommended, Maximum): " + RESET);
            String specLevel = in.nextLine().trim().toLowerCase();

            
            displaySpecs(userResp, specLevel);
        }

        System.out.println(GREEN + "Goodbye!" + RESET);
    }

    
    public static void displaySpecs(String userResp, String specLevel) {
        userResp = userResp.toLowerCase();
        specLevel = specLevel.toLowerCase();
        String[] arr3 = {"Sorry, I dont know that game you could try a diferent game", "we dont have that game in our database", "I've never heard of that game"};
        boolean gameFound = false;

        for (String[] gameSpec : gameSpecs) {
            String gameName = gameSpec[0].toLowerCase(); 
            if (userResp.contains(gameName)) {
                gameFound = true;

                String specs = "";
                if (specLevel.equals("minimum")) {
                    specs = gameSpec[1];
                } else if (specLevel.equals("recommended")) {
                    specs = gameSpec[2];
                } else if (specLevel.equals("maximum")) {
                    specs = gameSpec[3];
                } else {
                    System.out.println(GREEN + "Sorry, I don't understand the spec level you mentioned." + RESET);
                    return;
                }

                
                System.out.println(GREEN + "For " + gameSpec[0] + ", here are the " + specLevel + " specs:" + RESET);
                System.out.println(GREEN + specs + RESET);
                return;
            }
        }

        if (!gameFound) {
            
            System.out.println(GREEN + arr3[(int) (Math.random() * arr3.length)] + RESET);
        }
    }
}
