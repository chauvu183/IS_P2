import java.util.ArrayList;
import java.util.List;

public class Population {
    private List<Chromosome> population;
    private int size;

    public Population(final Gene[] points,final int size) {
        this.population = init(points, size);
        this.size = size;
    }

    public Chromosome getAlpa(){
        return this.population.get(0);
    }

    /*
    Create a random population
     */
    private List<Chromosome> init(final Gene[] points, final int size){
        final List<Chromosome> eden = new ArrayList<>();
        for(int i= 0; i< size; i++){
            final Chromosome chromosome = Chromosome.createChromosome(points);
            eden.add(chromosome);
        }
        return eden;
    }
    public int getSize() {
        return size;
    }

    void update(){
        //TODO
    }

    private void doCrosover(){
        //TODO
    }


}
