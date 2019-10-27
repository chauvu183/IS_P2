import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Chromosome {
    private final List<Gene> chromosome;

    public Chromosome(List<Gene> chromosome) {
        this.chromosome = chromosome;
    }

    /*
    Initialize the population. We take the data point that was given and copy to a new array
    -> shuffle that to create a random chromosome.
     */
    static Chromosome createChromosome(final Gene[] points){
        final List<Gene> genes = Arrays.asList(Arrays.copyOf(points,points.length));
        Collections.shuffle(genes);
        return new Chromosome(genes);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for(final Gene gene : this.chromosome){
            builder.append(gene.toString()).append(" : ");
        }
        return builder.toString();
    }

    public List<Gene> getChromosome() {
        return this.chromosome;
    }

    double calculateDistance(){
        double total = 0.0f;
        for(int i = 0; i< this.chromosome.size()-1;i++){
            total += this.chromosome.get(i).distance(this.chromosome.get(i+1));
        }
        return total;
    }
    /*
    The Offsprings (from 2 Chromosome) will be created by exchanging the genes of parents among themselves until the crossoverpoint is reached.
     */
    Chromosome crossOver(){
        //TODO
        return null;
    }

    /*
        Some gene in the chromosome will be flipped to maintain the diversity within the population.
     */
    Chromosome mutation(){
        //TODO
        return null;
    }
}