package iodigital.io_travelcoach.script;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CSVReader<T> {

    private final Class<T> type;

    public CSVReader(Class<T> type) {
        this.type = type;
    }

    public List<T> readCSV(File csvFile) throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = csvMapper.schemaFor(type).withHeader().withColumnSeparator(',');

        MappingIterator<T> it = csvMapper.readerFor(type).with(schema).readValues(csvFile);
        return it.readAll();
    }
}
