package basic.human3;

class Spanish extends Human{
    public Spanish(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hola, mi nombre es " + name + ".");
    }
}
