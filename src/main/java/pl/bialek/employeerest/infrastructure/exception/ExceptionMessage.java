package pl.bialek.employeerest.infrastructure.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(staticName = "of")
public class ExceptionMessage {
    String errorId;
}
