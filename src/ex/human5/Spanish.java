package ex.human5;

import basic.human5.IfSayHello;

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
