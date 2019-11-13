import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ClauseDefinitionContainer {

    ClauseDefinition[] value();
}
