package clbo.startkodeita3.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MoviesRepository {

    List<Movie> movies;

    public MovieCSVRepository() throws FileNotFoundException {
        this.movies = new ArrayList<>();
        // read from csv file
        populateFile();
    }

    private void populateFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File("/Users/clbo/Tresors/KEA/ITA/playsites/movie-workshop/resources/imdb.csv"));
        input.useDelimiter(";|\n");
        while (input.hasNext()){
            String year = input.next();
            String length = input.next();
            String title = input.next();
            String subject = input.next();
            String popularity = input.next();
            String awards = input.next();
            movies.add(new Movie(  /*year, length, title, subject, popularity, awards*/  ));
        }
    }

    // readOne
    public Movie read(int id){
        return movies.get(id);
    }

    // readAll
    public List<Movie> readAll(){
        return movies;
    }

}
