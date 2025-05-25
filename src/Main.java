public class Main {
    public static void main(String[] args) {
        // task 1
        var dog = 8.0; var cat = 3.6; var paper = 763789;
        System.out.println(dog); System.out.println(cat); System.out.println(paper);
        // task 2
        dog += 4; cat += 4; paper += 4;
        // task 3
        dog -= 3.5; cat += 1.6; paper += 7639;
        // task 4
        var friend = 19; System.out.println(friend);
        friend += 2; System.out.println(friend);
        friend /= 7; System.out.println(friend);
        // task 5
        var frog = 3.5; System.out.println(frog);
        frog *= 10; System.out.println(frog);
        frog /= 3.5; System.out.println(frog);
        frog += 4; System.out.println(frog);
        // task 6
        var firstMan = 78.2; var secondMan = 82.7;
        var result = firstMan + secondMan; System.out.println(result);
        // task 7
        var task7 = secondMan % firstMan;
        // task 8.1
        var time = 640; var timePerWorker = 8;
        var amountWorkers = time / timePerWorker;
        System.out.println("Всего работников в компании — " + amountWorkers + " человек");
        // task 8.2
        var newWorkers = amountWorkers + 94;
        var newTime = newWorkers * timePerWorker;
        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");
    }
}
