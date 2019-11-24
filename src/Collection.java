public class Collection {
    static Integer[] array;

    Collection(Integer[] array) {
        this.array = array;
    }

    class Forward implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Integer next() {
            return array[index++];
        }
    }

        class Backward implements Iterator {

            int index = array.length - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Integer next() {
                index=index-2;
                return array[index+2];
            }
        }

        public Iterator createForwardIterator() {
            return new Forward();
        }

        public Iterator createBackwardIterator() {
            return new Backward();
        }

        public Iterator BackAnonimous(){
        return new Iterator() {

            int index=array.length-1;
            @Override
            public boolean hasNext() {
                return index>=0;
            }

            @Override
            public Integer next() {
                index=index-3;
                 return array[index+3];
            }
        };
        }

        public Iterator LocalForward(){
        class LocalForward implements Iterator{
            int index=0;

            @Override
            public boolean hasNext() {
                return index<array.length;
            }

            @Override
            public Integer next() {
                index=index+5;
                int num= array[index-5];
                if(num%2==0){
                    return num-=100;
                }else
                    return num;
            }
        }
        return new LocalForward();
        }

        static class StaticForward implements Iterator {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public Integer next() {
                index += 2;
                int num = array[index - 2];
                if (num % 2 == 0) {
                    return num += 1;
                } else
                    return num;
            }
        }

            public StaticForward createStaticForward(){
                return new StaticForward();
            }
}
