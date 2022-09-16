import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pet.*;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        DeletePetByIdTest.class,
        GetPetBiIdTest.class,
        PostPetByIdTest.class,
        PostPetTest.class,
        PutPetTest.class
})

public class PetStoreTestSuite {}
