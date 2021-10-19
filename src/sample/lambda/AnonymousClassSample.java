package sample.lambda;

class AnonymousClassSample {
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        runner.run();//Hello
    }
}
