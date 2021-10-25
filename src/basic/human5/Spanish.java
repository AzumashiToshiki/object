package basic.human5;

class Spanish implements IfSayHello {
    private String name;

    public Spanish(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hola, mi nombre es " + name + ".");
    }
}
