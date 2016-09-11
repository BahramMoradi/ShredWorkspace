/**
 * Created by bam on 01-09-2016.
 */

@Grab(group ='org.apache.commons', module ='commons-csv', version = '1.4')

import org.apache.commons.csv.CSVParser
import static org.apache.commons.csv.CSVFormat.*
import java.nio.file.Paths
/**
Paths.get('csv_test.txt').withReader{
    reader->
        CSVParser csv=new CSVParser(reader,DEFAULT.withHeader())
        csv.iterator().each {
            record->
                println record.get('NAME')
        }

}
*/
def list=[]
Paths.get('csv_test.txt').withReader{
    reader->
        CSVParser csv=new CSVParser(reader,DEFAULT.withHeader())
        csv.iterator().each {
            record->
               list << (record.toMap() as Expando)
        }
}

println list
println list[0].NAME

