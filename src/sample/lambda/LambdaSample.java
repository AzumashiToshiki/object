package sample.lambda;

class LambdaSample {
    public static void main(String[] args) {
        Runnable runner = () -> {System.out.println("Hello");};
        runner.run();//Hello
    }
}
