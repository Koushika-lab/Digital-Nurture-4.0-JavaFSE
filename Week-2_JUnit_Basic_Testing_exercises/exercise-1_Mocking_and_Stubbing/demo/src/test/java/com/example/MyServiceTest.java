package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create a mock object for ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stub getData() to return a predefined value
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mockApi into MyService
        MyService service = new MyService(mockApi);

        // Step 4: Call fetchData and assert it returns the stubbed value
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
