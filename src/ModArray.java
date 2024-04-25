import java.util.ArrayList;

public class ModArray<D> extends ArrayList<D>{

    public D getMod(int index){
        int validIndex = Math.abs(index % this.size());
        return this.get(validIndex);
    }

}
