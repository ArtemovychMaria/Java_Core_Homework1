public class Main {

    public static void main(String[] args) {
        Integer[]array={2,4,7,3,0,43,32,-5,22,-3};

        Collection collection=new Collection(array);

        System.out.println("=============Task1==========");
        Iterator forwardIterator = collection.createForwardIterator();

        while (forwardIterator.hasNext()){
            Integer next = forwardIterator.next();
            if(next %2!=0) {
                next = 0;
            }
            System.out.println(next);
        }

        System.out.println();
        System.out.println("===========Task2===============");

        Iterator backwardIterator = collection.createBackwardIterator();
        while (backwardIterator.hasNext()){
            System.out.println(backwardIterator.next());
        }

        System.out.println();

        System.out.println("==============Max================");
        System.out.println("==============Task3==============");

        Iterator backIterator = collection.BackAnonimous();
        while (backIterator.hasNext()){
            Integer next = backIterator.next();
            if (next%2!=0){
                System.out.println(next);
            }
        }

        System.out.println("=================Task4============");
        Iterator iterator2 = collection.LocalForward();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println();
        System.out.println("===========Task5===========");
        Collection.StaticForward staticForward = collection.createStaticForward();
        while (staticForward.hasNext()){
            System.out.println(staticForward.next());
        }


    }
}
