package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class VerifyTest {

    @Test
    void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Call method
        mockApi.getData();

        // Verify method invocation
        verify(mockApi).getData();
    }
}