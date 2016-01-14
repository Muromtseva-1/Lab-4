package  ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class App
{
    public static void main( String[] args )
    {
        List<Integer> Rndstream = new ArrayList<Integer>();
        int i = 0;
        System.out.println("Task № 1");
        for (i=0 ; i<10 ; i++) {

            Rndstream.add((int)(Math.random()*100));
            System.out.println(Rndstream.get(i));
        }
        System.out.println("Task № 2");
        Rndstream.stream().filter((e)-> (e.intValue() % 2 ==0)).forEach(System.out::println);

        System.out.println("Task № 3");
        Rndstream.stream().sorted().forEach(System.out::println);
        System.out.println("Task № 4");
        Consumer<Integer> NumberCrusher = (x)->System.out.println((x*2));
        Rndstream.forEach(NumberCrusher);
        System.out.println("Task № 5");
        RandomNameGenerator rnd = new RandomNameGenerator(0);
        List<String> randomame = new ArrayList<String>();
        System.out.println("Part 1");

        for (i=0;i<15;i=i +1) {
            String name = rnd.next();
            randomame.add(name);
            System.out.println((i+1)+" - " + randomame.get(i));
        }
        System.out.println("Part 2");
        randomame.stream().sorted().forEach(System.out::println);

    }}
