package com.epam.tsylko.andrei;



import com.epam.tsylko.andrei.server.Server;


import java.util.ArrayList;
import java.util.List;

//class Baker {
//    private final String str = "s";
//
//    public static void cook() {
//        System.out.println("I cook cake");
//    }
//    public String getStr() {
//        return str;
//    }
//}
//
//class MasterBaker extends Baker {
//
//}

public class Main {

//    static List<String> list = new ArrayList<>();
//
//    {
//        list.add("action=USER_EDITED&userId=17&userSurname=Ooooo&email=oooooo@mail.ru&phone=0000000000000&id=4");
//        list.add("action=USER_EDITED&userId=17&userSurname=Aaaaaa&email=aaaaa@mail.ru&phone=1111111111111&id=3");
//        list.add("action=USER_EDITED&userId=17&userSurname=Bbbbbb&email=bbbbbbb@mail.ru&phone=22222222222222&id=4");
//
//        list.add("action=USER_EDITED&userId=17&userSurname=Zzzzz&email=zzzzzzzz@mail.ru&phone=3333333333333&id=4");
//        list.add("action=USER_EDITED&userId=17&userSurname=Rrrrrr&email=rrrrrr@mail.ru&phone=4444444444444&id=3");
//
//        list.add("action=SHOW_ALL_BOOKS&id=1");
//        list.add("action=SHOW_ALL_BOOKS");
//        list.add("action=GET_USER&userId=10&id=10");
//        list.add("action=GET_USER&id=10");
//        list.add("action=GET_USER&userId=10");
//        list.add("action=GET_BOOK&bookId=3&id=3");
//        list.add("action=GET_BOOK&bookId=4&id=2");
//        list.add("action=GET_BOOK&bookId=3&id=5");
//        list.add("action=GET_BOOK&id=3");
//    }


    public static void main(String[] args) {
//        MasterBaker baker = new MasterBaker();
//        baker.cook();
//        System.out.println(baker.getStr());

//        try {
//            ConnectionPool connectionPool = new ConnectionPool();
//            Book book = new Book("Azazel","vico","pico","boon","london",12313123,122,100);
//            DAOFactory factory = DAOFactory.getInstance();
//            BookDao bookDao= factory.getMysqlBookImpl();
////            bookDao.addBook(book);
//            Book book1 = bookDao.getBook(9);
//            book1.setBooksName("Monteno");
//            bookDao.editBook(book1);
//            List<Book> bookList = bookDao.getBooks();
//            bookList.forEach(System.out::println);
//        } catch (ConnectionPoolException e) {
//            e.printStackTrace();
//        } catch (DAOException e) {
//            e.printStackTrace();
//        }


//        InetSocketAddress addr = new InetSocketAddress(8088);
//        HttpServer server = null;
//        try {
//            server = HttpServer.create(addr, 0);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        server.createContext("/", new MyHandler());
//        server.setExecutor(Executors.newCachedThreadPool());
//        server.start();



        List<String> list = new ArrayList<>();
        list.add("action=USER_EDITED&userId=17&userSurname=Ooooo&email=oooooo@mail.ru&phone=0000000000000&id=4");
        list.add("action=USER_EDITED&userId=17&userSurname=Aaaaaa&email=aaaaa@mail.ru&phone=1111111111111&id=3");
        list.add("action=USER_EDITED&userId=17&userSurname=Bbbbbb&email=bbbbbbb@mail.ru&phone=22222222222222&id=4");

        list.add("action=USER_EDITED&userId=17&userSurname=Zzzzz&email=zzzzzzzz@mail.ru&phone=3333333333333&id=4");
        list.add("action=USER_EDITED&userId=17&userSurname=Rrrrrr&email=rrrrrr@mail.ru&phone=4444444444444&id=3");

        list.add("action=SHOW_ALL_BOOKS&id=1");
        list.add("action=SHOW_ALL_BOOKS");
        list.add("action=GET_USER&userId=10&id=10");
        list.add("action=GET_USER&id=10");
        list.add("action=GET_USER&userId=10");
        list.add("action=GET_BOOK&bookId=3&id=3");
        list.add("action=GET_BOOK&bookId=4&id=2");
        list.add("action=GET_BOOK&bookId=3&id=5");
        list.add("action=GET_BOOK&id=3");

        Server server = Server.getInstance();

//        Server server = new Server();

        for (String s: list) {
            System.out.println("Thread return: " + server.processRequest(s));
        }

        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        Thread thread = new Thread(server);
//        thread.start();
//
//
//        Runnable r1 = new MyRunnable1();
//        Runnable r2 = new MyRunnable2();
//        Runnable r3 = new MyRunnable3();
//        Runnable r4 = new MyRunnable4();
//        Runnable r5 = new MyRunnable5();
//        Runnable r6 = new MyRunnable6();
//        Runnable r7 = new MyRunnable7();
//        Runnable r8 = new MyRunnable8();
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//        Thread t3 = new Thread(r3);
//        Thread t4 = new Thread(r4);
//        Thread t5 = new Thread(r5);
//        Thread t6 = new Thread(r6);
//        Thread t7 = new Thread(r7);
//        Thread t8 = new Thread(r8);
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
//        t7.start();
//        t8.start();


//        Controller controller = new Controller();
//
//
//
//        String userStatus="action=USER_STATUS&userId=11&status=&id=3";
//                System.out.println(controller.executeTask(userStatus));
//        String addBook = "action=ADD_BOOK&booksName=Java&authorName=Mark&" +
//                "authorSurname=Horn&publisher=Oreilly&cityPublisher=London&ISBN=978067&id=2";
//
//
//        System.out.println(controller.executeTask(showAllBooks));

//        String editedBook = "action=EDIT_BOOK&bookId=10&booksName=C#&authorName=Mark&" +
//                "authorSurname=Horn&publisher=Prisma&cityPublisher=London&ISBN=978067&id=3";
//        System.out.println(controller.executeTask(editedBook));

//        String getBook="action=GET_BOOK&bookId=3&id=3";
//                System.out.println(controller.executeTask(getBook));

//        String blockedBook="action=BOOK_AVAILABILITY_STATUS&bookId=3&isAvailable=false&id=3";
//        System.out.println(controller.executeTask(blockedBook));


//
//        String addAddress="action=HOME_ADDRESS&country=UK&city=London&street=Green Street&house=20&room=201&id=2";
//        System.out.println(controller.executeTask(addAddress));

//        String editAddress="action=EDIT_ADDRESS&addressId=4&country=UK&city=Manchester&street=Green Street&house=20&room=201&id=2";
//        System.out.println(controller.executeTask(editAddress));

//        String currentAddress="action=CURRENT_ADDRESS&addressId=4&country=UK&city=Manchester&street=Green Street&house=20&room=201&id=2";
//        System.out.println(controller.executeTask(currentAddress));

//        String addUser="action=USER_REGISTRATION&login=monk8&password=monk8&userName=Anto&userSurname=Anto&birthday=1986-02-03&email=anto@mail.ru&phone=37525515666";
//        System.out.println(controller.executeTask(addUser));

//        String addUser="action=USER_EDITED&userId=16&login=monk8&password=monk8&userName=Marto&userSurname=Anto&birthday=1986-02-03&email=anto@mail.ru&phone=37525515666&id=10";
//        System.out.println(controller.executeTask(addUser));

//        String addUser2="action=USER_REGISTRATION&login=monk3&password=monk3&userName=Anto&userSurname=Anto&birthday=1986-02-03&email=anto@mail.ru&phone=37525515666";
//        System.out.println(controller.executeTask(addUser2));

//        String editUser="action=USER_EDITED&userId=10&password=monkM&userName=Anto&userSurname=Anto&birthday=1986-02-03&email=anto@mail.ru&phone=37525515666&id=10";
//        System.out.println(controller.executeTask(editUser));


//        String allUsers="action=ALL_USERS&email=anto@mail.ru&phone=37525515666&id=3";
//        System.out.println(controller.executeTask(allUsers));


//        String oneUser="action=GET_USER&userId=10&email=anto@mail.ru&phone=37525515666&id=10";
//        System.out.println(controller.executeTask(oneUser));


//                String userStatus="action=USER_STATUS&userId=11&id=3";
//
//        System.out.println(controller.executeTask(userStatus));

//                        String reservBook="action=BOOK_RESERVATION&userId=11&bookId=4&id=3";
//        System.out.println(controller.executeTask(reservBook));

//        String reservBookBanUser="action=BOOK_RESERVATION&userId=11&bookId=4&id=11";
//        System.out.println(controller.executeTask(reservBookBanUser));


//        String reservBookCancel="action=CANCELLATION_BOOK_RESERVATION&orderId=6&bookId=4&id=3";
//        System.out.println(controller.executeTask(reservBookCancel));

//        String leavesBook="action=BOOK_LEAVED_LIBRARY&orderId=5&bookId=4&id=3";
//        System.out.println(controller.executeTask(leavesBook));

//        String returnedBook="action=BOOK_RETURNED_COMMAND&orderId=5&bookId=4&id=3";
//        System.out.println(controller.executeTask(returnedBook));

//                String userRole="action=USER_ROLE&userId=11&role=SUPER_ADMIN&id=3";
//        System.out.println(controller.executeTask(userRole));


//        String reduceRoleCommand="action=REDUCE_ACCESS_LEVEL_COMMAND&userId=11&role=USER&id=4";
//        System.out.println(controller.executeTask(reduceRoleCommand));

//        String signIn="action=SIGN_IN&login=monk3&password=monk3";
//        System.out.println(controller.executeTask(signIn));
//
//        String sordtedFreeBooks="action=SORTED_BOOKS&order=desc";
//        System.out.println(controller.executeTask(sordtedFreeBooks));


//        System.out.println(ControllerUtil.cutActionPart(a));
//        try {
//            Map<String,String> map = ControllerUtil.castRequestParamToMap(a);
////            map.forEach((k,v)->{System.out.println("key : " + k + " Value : " + v);});
//
////            map.values().stream().anyMatch("booksName");
//        } catch (ControllerUtilException e) {
//            e.printStackTrace();
//        }
//
//        ServiceFactory factory = ServiceFactory.getInstance();
//        ClientService service = factory.getClientService();
//        try {
//            System.out.println(service.checkUserRole(2, Role.USER));
//        } catch (ServiceException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            System.out.println(ControllerUtil.findUserIdInRequest(a));
//        } catch (ControllerUtilException e) {
//            e.printStackTrace();
//        }


    }
}



