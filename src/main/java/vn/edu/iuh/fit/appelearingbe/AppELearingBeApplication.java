package vn.edu.iuh.fit.appelearingbe;

import jakarta.persistence.Persistence;
import net.datafaker.Faker;
import net.datafaker.providers.food.Tea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.iuh.fit.appelearingbe.enums.StatusBill;
import vn.edu.iuh.fit.appelearingbe.enums.StatusCourse;
import vn.edu.iuh.fit.appelearingbe.enums.StatusLesson;
import vn.edu.iuh.fit.appelearingbe.ids.EnrollCourseId;
import vn.edu.iuh.fit.appelearingbe.ids.LessonUserId;
import vn.edu.iuh.fit.appelearingbe.models.*;
import vn.edu.iuh.fit.appelearingbe.repositories.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class AppELearingBeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AppELearingBeApplication.class, args);
    }


    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private BillRepository billRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private EnrollCourseRepository enrollCourseRepository;

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private LessonRepository lessonRepository;

    @Autowired
    private LessonUserRepository lessonUserRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private SectionRepository sectionRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        // Tạo 2 Teacher
//        for (int i = 1; i <= 2; i++) {
//            Teacher teacher = new Teacher();
//            teacher.setName(faker.name().fullName());
//            teacher.setEmail(faker.internet().emailAddress());
//            teacher.setPassword(faker.internet().password());
//            teacher.setDescription(faker.lorem().sentence());
//            teacher.setAvatar(faker.avatar().image());
//            teacher.setExperience(faker.number().numberBetween(1, 10));
//            teacher.setSchool(faker.educator().university());
//            teacherRepository.save(teacher);
//        }
//
//        // Tạo 5 Student
        //        for (int i = 3; i <= 7; i++) {
        //            Student student = new Student();
        //            student.setName(faker.name().fullName());
        //            student.setEmail(faker.internet().emailAddress());
        //            student.setPassword(faker.internet().password());
        //            student.setDescription(faker.lorem().sentence());
        //            student.setAvatar(faker.avatar().image());
        //            student.setGrade("University");
        //            student.setSchool(faker.educator().university());
        //            studentRepository.save(student);
        //        }


        Random random = new Random();
//        // Tạo danh sách Course
//        List<Course> courses = new ArrayList<>();
//        for (int i = 1; i <= 7; i++) {
//            Course course = new Course();
//            course.setTitle(faker.book().title());
//            course.setDescription(faker.lorem().paragraph());
//            course.setCategory(categoryRepository.findById((long) (i%5)));
//            course.setPrice(faker.number().randomDouble(2, 10, 100));
//            course.setRating(faker.number().numberBetween(1, 5) + ".0");
//            course.setCreatedAt(faker.date().birthday().toLocalDateTime());
//            course.setTeacher(teacherRepository.findById(faker.number().numberBetween(1, 2)));
//            course.setStatus(i%3==0? StatusCourse.HOT:i%2==0?StatusCourse.NEW:StatusCourse.BEST_SELLER);
//            courseRepository.save(course);
//
//            // Tạo từ 3-5 Section
//            List<Section> sections = new ArrayList<>();
//            for (int j = 1; j <= random.nextInt(3) + 3; j++) {
//                Section section = new Section();
//                section.setTitle(faker.lorem().sentence());
//                section.setSectionNumber(j);
//                section.setCourse(course);
//
//                sectionRepository.save(section);
//
//                // Tạo từ 3-5 Lesson
//                List<Lesson> lessons = new ArrayList<>();
//                for (int k = 1; k <= random.nextInt(3) + 3; k++) {
//                    Lesson lesson = new Lesson();
//                    lesson.setTitle(faker.educator().course());
//                    lesson.setUrl(faker.internet().url());
//                    lesson.setTime(String.valueOf(random.nextInt(30) + 10) +":"+ String.valueOf(random.nextInt(60)));
//                    lesson.setLessonNumber(k);
//                    lesson.setSection(section);
//                    lesson.setView((long) faker.number().numberBetween(1, 1000));
//                    lessons.add(lesson);
//                    lessonRepository.save(lesson);
//                }
//
//                section.setLessons(lessons);
//                sections.add(section);
//            }
//
//            course.setSections(sections);
//        }

//            for (long userId = 3; userId <= 7; userId++) {
//                for (int i = 1; i <= random.nextInt(3) + 1; i++) { // Mỗi user enroll vào 1-3 khóa học
//                    long courseId = random.nextInt(7) + 1; // Random courseId từ 1 -> 7
//
//                    EnrollCourse enrollCourse = new EnrollCourse();
//                    enrollCourse.setId(new EnrollCourseId(studentRepository.findById(userId), courseRepository.findById(courseId)));
//                    LocalDateTime enrolledDate = faker.date().birthday().toLocalDateTime().minusDays(random.nextInt(30) + 1);
//                    enrollCourse.setEnrolledDate(enrolledDate);
//
//                    // Random trạng thái tiến trình
//                    boolean isCompleted = false;
//                    int progress = isCompleted ? 100 : random.nextInt(100);
//                    enrollCourse.setProgress(progress);
//                    if (isCompleted) {
//                        enrollCourse.setCompletedDate(enrollCourse.getEnrolledDate().plusDays(random.nextInt(60) + 30)); // Hoàn thành sau 30-90 ngày
//                    } else {
//                        enrollCourse.setCompletedDate(null);
//                    }
//
//                    List<Section> sections = sectionRepository.findByCourseId(courseId);
//                    for (Section s : sections){
//                        List<Lesson> lessons = lessonRepository.findBySectionId(s.getId());
//                        int lessonprogress = lessons.size() * progress / 100;
//                        for(int l = 0;  l<lessons.size(); l++){
//
//                            LessonUser lessonUser = new LessonUser();
//                            lessonUser.setId(new LessonUserId(lessons.get(l), studentRepository.findById(userId)));
//                            lessonUser.setStatus(l < lessonprogress ? StatusLesson.COMPLETED : StatusLesson.UNCOMPLETED);
//                            lessonUserRepository.save(lessonUser);
//                        }
//                    }
//
//                    // Lưu vào cơ sở dữ liệu
//                    enrollCourseRepository.save(enrollCourse);
//                    Bill bill = new Bill();
//                    bill.setId(new EnrollCourseId(studentRepository.findById(userId), courseRepository.findById(courseId)));
//                    bill.setStatus(StatusBill.PAID);
//                    bill.setCreatedDate(enrolledDate);
//                    bill.setPayment(paymentRepository.findById((long) random.nextInt(3) + 1));
//                    billRepository.save(bill);
//                }
//            }
//        a
    }
}
