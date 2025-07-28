class Super {
    public void display() {
        System.out.println("super class displayed");
    }
}

class Sub extends Super {

    @Override
    public void display() {
        super.display();
        System.out.println("sub class displayed");
    }
}

class Demosuper {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.display();
    }
}
