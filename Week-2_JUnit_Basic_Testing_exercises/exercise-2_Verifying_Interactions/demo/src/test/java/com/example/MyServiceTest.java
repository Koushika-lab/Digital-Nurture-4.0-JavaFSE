package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock object for ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Create the MyService instance with the mocked dependency
        MyService service = new MyService(mockApi);

        // Step 2: Call the method under test
        service.fetchData();

        // Step 3: Verify that getData() was called on mockApi
        verify(mockApi).getData();
    }
}
