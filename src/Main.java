public class Main {
    public static void main(String[] args) {

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var hotDog = dog - 3.5;
        var niceCat = cat - 1.6;
        var newPaper = paper - 7639;
        System.out.println(hotDog);
        System.out.println(niceCat);
        System.out.println(newPaper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println(totalWeight);
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println(weightDifference);
        weightDifference = secondBoxer % firstBoxer;
        System.out.println(weightDifference);
        var totalTime = 640;
        var oneWorker = 8;
        var numberWorkers = totalTime / oneWorker;
        System.out.println("Всего работников в компании " + numberWorkers + " человек");
        numberWorkers = numberWorkers + 94;
        oneWorker = totalTime / numberWorkers;
        System.out.println("Если в компании работает " + numberWorkers + " человек, то всего " + oneWorker + " часов работы может быть поделено между сотрудниками" );


    }
}