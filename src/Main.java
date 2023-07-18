public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setGender("Женский");
        girl.setName("Руби");
        girl.setBirthYear(2004);
        girl.setSurname("Аи");
        Boy boy = new Boy();
        boy.setGender("Мужской");
        boy.setName("Аква");
        boy.setBirthYear(2006);
        boy.setSurname("Аи");

        //set age
        girl.setAge(2023-girl.getBirthYear());
        boy.setAge(2023-boy.getBirthYear());

        System.out.println(girl);
        System.out.println("\n\n");
        System.out.println(boy);
        System.out.println("\n\n");

        if (boy.getAge() > girl.getAge()){
            System.out.println(boy.getName()+" старше чем "+girl.getName());
        }
        else {
            System.out.println(girl.getName() + " старше чем "+boy.getName());
        }
    }
}