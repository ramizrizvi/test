

class Book<T>{

    T type_of_book;

    @Override
    public String toString() {
        return "Book{" +
                "type_of_book=" + type_of_book +
                '}';
    }

    public Book(T type){
        this.type_of_book = type;

    }


    public void meth1(){
        System.out.println(type_of_book);
    }

    public void meth2(Book<?> now){
        System.out.println(now);
    }

}
