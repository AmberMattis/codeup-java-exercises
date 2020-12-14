package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String movieName, String movieCategory){
        this.name = movieName;
        this.category = movieCategory;
    }

    public void setMovieName(String name){
        this.name = name;
    }

    public void setMovieCategory(String category){
        this.category = category;
    }

    public String getMovieName(){
        return this.name;
    }

    public String getMovieCategory(){
        return this.category;
    }






}
