
public class Item {
        Object data;
        private Item next;
        private Item previous;

        public Item(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Item getNext() {
            return next;
        }

        void setNext(Item element){
            next = element;
        }

        void setPrevious(Item element){
            previous = element;
        }

        public Item getPrevious() {
            return previous;
        }
}

