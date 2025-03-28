package dev.mmaysonet.pokedex.api.response;

import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record MeasurementResponse(@NonNull String height, @NonNull String weight) {}
