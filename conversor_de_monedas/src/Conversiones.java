import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public record Conversiones(
        @SerializedName("conversion_rates") Map<String, Double> monedas
    ) {
}
