//package makeup.example.demo.Service.impl;
//import makeup.example.demo.Models.Product;
//import makeup.example.demo.Models.exceptions.ExceptionProductNotFound;
//import makeup.example.demo.Repository.ProductRepository;
//import makeup.example.demo.Service.ProductService;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.Base64;
//import java.util.List;
//
//@Service
//public class ProductServiceImpl implements ProductService {
//    private final ProductRepository productRepository;
//
//    public ProductServiceImpl(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//
////    @Override
////    public Trip saveTrip(Trip trip, MultipartFile image) throws IOException {
////        Hotel hotel = this.hotelService.findById(trip.getHotel().getIdHotel());
////        Grad grad = this.gradService.findById(trip.getGrad().getIdGrad());
////        Restoran restoran = this.restoranService.findById(trip.getRestoran().getIdRestoran());
////        trip.setGrad(grad);
////        trip.setRestoran(restoran);
////        trip.setHotel(hotel);
////        if (image != null && !image.getName().isEmpty()) {
////            byte[] bytes = image.getBytes();
////            String base64Image = String.format("data:%s;base64,%s", image.getContentType(), Base64.getEncoder().encodeToString(bytes));
////            trip.setImageBase64(base64Image);
////        }
////
////
////        return this.tripRepository.save(trip);
////    }
//
//    @Override
//    public Product saveTrip(Product product, MultipartFile image) throws IOException {
//        return null;
//    }
//
//    @Override
//    public List<Product> findAllProducts() {
//        return this.productRepository.findAll();    }
//
//    @Override
//    public Product findById(Long id) {
//        return this.productRepository.findById(id).orElseThrow(()->new ExceptionProductNotFound(id));
//
//    }
//
//    @Override
//    public Product updateProduct(Long id, Product product, MultipartFile image) throws IOException {
//        return null;
//    }
//
//    //    @Override
////    public Product updateTrip(Long id, Product product, MultipartFile image) throws IOException {
////        Product p = this.findById(id);
////        if (image != null && !image.getName().isEmpty()) {
////            byte[] bytes = image.getBytes();
////            String base64Image = String.format("data:%s;base64,%s", image.getContentType(), Base64.getEncoder().encodeToString(bytes));
////            p.setImageBase64(base64Image);
////        }
////        return this.productRepository.save(p);
////    }
////Delete by id
//    @Override
//    public void deleteById(long id) {
//        this.productRepository.deleteById(id);
//    }
//}
