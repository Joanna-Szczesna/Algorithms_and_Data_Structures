package szczesnaj.algorithms;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class GraphDepthFirstSearchTest {
    @Test
    void whenCountGraphsFromFileWithEdgesContainsThreeDistjointGraphsReturnThree() throws URISyntaxException {
        URL resource = getClass().getClassLoader().getResource("m_3graphsTest.txt");
        String path = Paths.get(resource.toURI()).toString();
        int numberGraphs = GraphDepthFirstSearch.countGraphs(path);

        assertEquals(3, numberGraphs);
    }
}