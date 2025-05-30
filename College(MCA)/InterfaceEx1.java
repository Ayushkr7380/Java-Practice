interface Human{
    void longHair();
    void smartness();
}
class Girl implements  Human{
    @Override
    public void longHair(){
        System.out.println("This girl has long hair.");
    }
    @Override
    public void smartness(){
        System.out.println("This girl is very smart.");
    }
}
class InterfaceEx1{
    public static void main(String args[]){
        Girl ayushi = new Girl();
        ayushi.longHair();
        ayushi.smartness(); 
    }
}