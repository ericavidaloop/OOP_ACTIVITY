 class Dog {

    String Name;
    boolean isMale;
    int num_of_puppies;
    String[] listOfPuppies;

    public void setName(String name){
        Name = name;
    }

    public String showName(){
        return Name;
    }

    public void bark(){
        System.out.println("Woof! Woof!");
    }

    public void setListOfPuppies(String[] puppies){

        listOfPuppies = puppies;
    
    }

    public int show_numOfPuppies(){
        int count = 0; 

        for (int i = 0; i < listOfPuppies.length; i++){
            count++;
        }
        return count;
    }

    public void showPuppies(){    
        for (int i = 0; i < listOfPuppies.length; i++){
            System.out.println(listOfPuppies[i]);
        }
    }    


}





















