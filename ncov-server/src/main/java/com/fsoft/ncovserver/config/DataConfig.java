package com.fsoft.ncovserver.config;

import com.fsoft.ncovserver.model.Account;
import com.fsoft.ncovserver.model.Declarer;
import com.fsoft.ncovserver.model.Region;
import com.fsoft.ncovserver.model.Vietnam;
import com.fsoft.ncovserver.model.World;
import com.fsoft.ncovserver.repository.AccountRepository;
import com.fsoft.ncovserver.repository.DeclarerRepository;
import com.fsoft.ncovserver.repository.VietnamRepository;
import com.fsoft.ncovserver.repository.WorldRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = {VietnamRepository.class, WorldRepository.class, AccountRepository.class, DeclarerRepository.class})
@Configuration
public class DataConfig {

    @Bean
    CommandLineRunner commandLineRunner(VietnamRepository vietnamRepository, WorldRepository worldRepository, AccountRepository accountRepository, DeclarerRepository declarerRepository){
        return string -> {
            // //vietnam
            // vietnamRepository.save(new Vietnam("1", 54, false, "Hà Nội", "Đang điều trị", "Việt Nam"));
            // vietnamRepository.save(new Vietnam("2", 29, false, "Quảng Ninh", "Khỏi", "Thụy Điển"));
            // vietnamRepository.save(new Vietnam("3", 22, true, "Hồ Chí Minh", "Đang điều trị", "Trung Quốc"));
            // vietnamRepository.save(new Vietnam("4", 39, false, "Hà Giang", "Đang điều trị", "Việt Nam"));
            // vietnamRepository.save(new Vietnam("5", 61, false, "Đà Nẵng", "Khỏi", "Hàn Quốc"));
            // vietnamRepository.save(new Vietnam("6", 52, true, "Hà Tĩnh", "Khỏi", "Việt Nam"));
            // vietnamRepository.save(new Vietnam("7", 27, false, "Hà Nam", "Đang điều trị", "Thụy Điển"));
            // vietnamRepository.save(new Vietnam("8", 17, false, "Bạc Liêu", "Khỏi", "Trung Quốc"));
            // vietnamRepository.save(new Vietnam("9", 35, true, "Vĩnh Phúc", "Đang điều trị", "Việt Nam"));
            // vietnamRepository.save(new Vietnam("10", 66, false, "Bình Thuận	", "Đang điều trị", "Trung Quốc"));
            // vietnamRepository.save(new Vietnam("11", 50, true, "Thừa Thiên Huế", "Khỏi", "Việt Nam"));
            // vietnamRepository.save(new Vietnam("12", 13, false, "Quảng Ninh", "Đang điều trị", "Nhật Bản"));
            // vietnamRepository.save(new Vietnam("13", 15, true, "Cần Thơ", "Khỏi", "Trung Quốc"));
            // vietnamRepository.save(new Vietnam("14", 35, true, "Quảng Nam", "Đang điều trị", "Việt Nam"));
            // vietnamRepository.save(new Vietnam("15", 64, false, "Đà Nẵng", "Đang điều trị", "Vương quốc Anh"));
            // vietnamRepository.save(new Vietnam("16", 66, false, "Hà Nội", "Đang điều trị", "Trung Quốc"));
            // vietnamRepository.save(new Vietnam("17", 50, true, "Thừa Thiên Huế", "Khỏi", "Việt Nam"));
            // vietnamRepository.save(new Vietnam("18", 13, false, "Bắc Giang", "Đang điều trị", "Nhật Bản"));
            // vietnamRepository.save(new Vietnam("19", 15, true, "Ninh Bình", "Khỏi", "Trung Quốc"));
            // vietnamRepository.save(new Vietnam("20", 35, true, "Thanh Hóa", "Đang điều trị", "Việt Nam"));
            // vietnamRepository.save(new Vietnam("21", 64, false, "Đà Nẵng", "Đang điều trị", "Vương quốc Anh"));

            // //world
            // worldRepository.save(new World("1", "Việt Nam", 268, 2.79, 177, 0, new Region("AS", "Asia")));
            // worldRepository.save(new World("2", "Trung Quốc", 82341, 58.73, 77892, 3342, new Region("AS", "Asia")));
            // worldRepository.save(new World("3", "Hàn Quốc", 10613, 204.96, 7757, 229, new Region("AS", "Asia")));
            // worldRepository.save(new World("4", "Nhật Bản", 8582, 68.14, 901, 136, new Region("AS", "Asia")));
            // worldRepository.save(new World("5", "Ấn Độ", 12759, 9.38, 1515, 420, new Region("AS", "Asia"))); 
            // worldRepository.save(new World("6", "I-ran", 77995, 935.97, 52229, 4869, new Region("AS", "Asia")));
            // worldRepository.save(new World("7", "Thái Lan", 2938, 44.19, 2652, 54, new Region("AS", "Asia")));
            // worldRepository.save(new World("8", "Singapore", 14951, 2621.33, 1095, 14, new Region("AS", "Asia")));
            // worldRepository.save(new World("9", "Mông Cổ", 38, 11.48, 9, 0, new Region("AS", "Asia")));
            // worldRepository.save(new World("10", "Indonesia", 9096, 34.08, 1151, 765, new Region("AS", "Asia")));

            // worldRepository.save(new World("11", "Vương Quốc Anh", 98476, 1482.28, 15001, 12868, new Region("EU", "Europe")));    
            // worldRepository.save(new World("12", "Ý", 165155, 2741.46, 38092, 21645, new Region("EU", "Europe")));
            // worldRepository.save(new World("13", "Thuỵ Điển", 12540, 1213.53, 222, 1333, new Region("EU", "Europe")));
            // worldRepository.save(new World("14", "Nga", 93558, 637.55, 8456, 867, new Region("EU", "Europe")));    
            // worldRepository.save(new World("15", "Pháp", 128339, 1913.34, 45513, 23293, new Region("EU", "Europe")));
            // worldRepository.save(new World("16", "Đức", 158758, 1909.31, 107595, 6126, new Region("EU", "Europe")));
            // worldRepository.save(new World("17", "Tây Ban Nha", 209465, 4447.2, 100875, 23521, new Region("EU", "Europe")));    
            // worldRepository.save(new World("18", "Bỉ", 46687, 4051.12, 10878, 7207, new Region("EU", "Europe")));
            // worldRepository.save(new World("19", "Áo", 15256, 1713.66, 12362, 549, new Region("EU", "Europe")));
            // worldRepository.save(new World("20", "Hy Lạp", 2534, 236.28, 577, 136, new Region("EU", "Europe")));   

            // worldRepository.save(new World("21", "Hoa Kỳ", 1010277, 3065.27, 113854, 56634, new Region("NA", "North America"))); 
            // worldRepository.save(new World("22", "Mexico", 15529, 122.68, 2627, 1434, new Region("NA", "North America")));
            // worldRepository.save(new World("23", "Ca-na-đa", 48500, 1277.02, 18268, 2707, new Region("NA", "North America"))); 
            // worldRepository.save(new World("24", "Greenland", 11, 196.14, 11, 0, new Region("NA", "North America")));
            // worldRepository.save(new World("25", "Cu-ba", 1389, 123.91, 525, 56, new Region("NA", "North America"))); 
            // worldRepository.save(new World("26", "Pa-na-ma", 6021, 1427.18, 455, 167, new Region("NA", "North America")));
            // worldRepository.save(new World("27", "Cốt-xta-ri-ca", 697, 137.8, 287, 6, new Region("NA", "North America"))); 
            // worldRepository.save(new World("28", "Cộng hoà Dominica", 6293, 607.53, 993, 282, new Region("NA", "North America")));
            // worldRepository.save(new World("29", "Bahamas", 80, 207.61, 22, 11, new Region("NA", "North America")));

            // worldRepository.save(new World("30", "Brazil", 66896 , 316.54, 30152, 4555, new Region("SA", "South America")));
            // worldRepository.save(new World("31", "Argentina", 3990 , 88.79, 1129, 197, new Region("SA", "South America")));
            // worldRepository.save(new World("32", "Chile", 13813 , 722.92, 7327, 198, new Region("SA", "South America")));
            // worldRepository.save(new World("33", "Colombia", 5597 , 113.31, 1210, 253, new Region("SA", "South America")));
            // worldRepository.save(new World("34", "Peru", 28699 , 893.18, 8425, 782, new Region("SA", "South America")));
            // worldRepository.save(new World("35", "Bolivia", 950 , 82.83, 50, 80, new Region("SA", "South America")));
            // worldRepository.save(new World("36", "Venezuela", 329	 , 10.21, 142, 10, new Region("SA", "South America")));
            // worldRepository.save(new World("37", "Uruguay", 606 , 172.23, 375, 15, new Region("SA", "South America")));

            // worldRepository.save(new World("38", "Úc", 6725 , 258.13, 4258, 71, new Region("AU", "Australia")));
            // worldRepository.save(new World("39", "New Zealand", 1472 , 295.88, 1214, 19, new Region("AU", "Australia")));
            // worldRepository.save(new World("40", "Cộng hòa Fiji", 18 , 20.34, 12, 0, new Region("AU", "Australia")));

            // worldRepository.save(new World("41", "Nam Phi", 3300 , 56.15, 1055, 58, new Region("AF", "Africa")));
            // worldRepository.save(new World("42", "Ai Cập", 4782 , 47.72, 1236, 337, new Region("AF", "Africa")));
            // worldRepository.save(new World("43", "Libya", 61 , 8.88, 18, 2, new Region("AF", "Africa")));
            // worldRepository.save(new World("44", "Nigeria", 1337 , 6.49, 255, 40, new Region("AF", "Africa")));
            // worldRepository.save(new World("45", "Maroc", 4120 , 114.9, 695, 162, new Region("AF", "Africa")));

            // //account
            // accountRepository.save(new Account("1", "sa", "123", "Admin"));
            // accountRepository.save(new Account("2", "haha", "123", "Nghĩa Lê"));

            // //declarer
            // declarerRepository.save(new Declarer("1", "Lê Văn A", "09818181", "lva@gmail.com", "Hà Nội", "Sốt trên 37 °C, Ho,"));
            // declarerRepository.save(new Declarer("2", "Lê Thị B", "09818182", "ltb@gmail.com", "Hồ Chí Minh", "Sốt trên 37 °C, Ho, Tiếp xúc gần với người bệnh,"));
;     };
    }
}