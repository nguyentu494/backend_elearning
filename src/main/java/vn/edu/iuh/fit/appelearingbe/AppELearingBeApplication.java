package vn.edu.iuh.fit.appelearingbe;

import jakarta.persistence.Persistence;
import net.datafaker.Faker;
import net.datafaker.providers.food.Tea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.iuh.fit.appelearingbe.models.Course;
import vn.edu.iuh.fit.appelearingbe.models.Student;
import vn.edu.iuh.fit.appelearingbe.models.Teacher;
import vn.edu.iuh.fit.appelearingbe.repositories.*;

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
//        // Tạo 2 Teacher
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
//        Random random = new Random();
//
//        // Tạo danh sách Course
//        List<Course> courses = new ArrayList<>();
//        for (int i = 1; i <= 7; i++) {
//            Course course = new Course();
//            course.setTitle(faker.book().title());
//            course.setDescription(faker.lorem().paragraph());
//
//            course.setPrice(faker.number().randomDouble(2, 10, 100));
//            course.setRating(String.valueOf(random.nextInt(5) + 1));
//            course.setCreatedAt(faker.date().past(1000, java.util.concurrent.TimeUnit.DAYS).toLocalDateTime());
//
//            // Tạo từ 3-5 Section
//            List<Section> sections = new ArrayList<>();
//            for (int j = 1; j <= random.nextInt(3) + 3; j++) {
//                Section section = new Section();
//                section.setId((long) (i * 10 + j));
//                section.setTitle(faker.lorem().sentence());
//                section.setSectionNumber(j);
//
//                // Tạo từ 3-5 Lesson
//                List<Lesson> lessons = new ArrayList<>();
//                for (int k = 1; k <= random.nextInt(3) + 3; k++) {
//                    Lesson lesson = new Lesson();
//                    lesson.setId((long) (j * 10 + k));
//                    lesson.setTitle(faker.educator().course());
//                    lesson.setUrl(faker.internet().url());
//                    lesson.setTime(String.valueOf(random.nextInt(30) + 10) + " min");
//                    lesson.setLessonNumber(k);
//                    lessons.add(lesson);
//                }
//
//                section.setLessons(lessons);
//                sections.add(section);
//            }
//
//            course.setSections(sections);
//            courses.add(course);
        }
    }
}
