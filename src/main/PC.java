package main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PC {
    private String hardware;
    private String monitor_size;
    private String setup;
    private String drivers;
}

