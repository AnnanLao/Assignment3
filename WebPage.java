package se.chalmers.dm;

public class WebPage {
    public class webPage {
        private int popularity ;
        private int id;
        private int author;
        private String content;
        private URL myURL;

        public User(int popularity, int id, int author, String content, String myURL){

            this.popularity = popularity;
            this.id = id;
            this.author = author;
            this.content = content;
            this.myURL = myURL;
        }
}
