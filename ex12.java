
import java.util.*;

class ResumeAnalyzer {

    private static final String[] SKILLS = {
        "python", "java", "c", "c++", "sql",
        "machine learning", "deep learning",
        "artificial intelligence", "data science",
        "html", "css", "javascript", "power bi",
        "excel", "tensorflow", "pandas", "numpy",
        "opencv"
    };

    private List<String> findSkills(String text) {

        List<String> found = new ArrayList<>();
        String lowerText = text.toLowerCase();

        for (String skill : SKILLS) {

            String pattern = "(?<![a-zA-Z0-9+#])"
                    + java.util.regex.Pattern.quote(skill)
                    + "(?![a-zA-Z0-9+#])";

            if (java.util.regex.Pattern
                    .compile(pattern)
                    .matcher(lowerText)
                    .find()) {

                found.add(skill);
            }
        }

        return found;
    }

    public void analyze(String resume, String jobDescription) {

        List<String> resumeSkills = findSkills(resume);
        List<String> requiredSkills = findSkills(jobDescription);

        List<String> matched = new ArrayList<>(resumeSkills);
        matched.retainAll(requiredSkills);

        List<String> missing = new ArrayList<>(requiredSkills);
        missing.removeAll(resumeSkills);

        double score = requiredSkills.isEmpty() ? 0.0
                : matched.size() * 100.0 / requiredSkills.size();

        System.out.println("\n===== ANALYSIS RESULT =====");

        System.out.println("Detected Resume Skills: "
                + show(resumeSkills));

        System.out.println("Required Job Skills: "
                + show(requiredSkills));

        System.out.println("Matched Skills: "
                + show(matched));

        System.out.println("Missing Skills: "
                + show(missing));

        System.out.printf(Locale.US,
                "Resume Match Score: %.2f%%%n", score);

        if (score >= 75) {
            System.out.println("Recommendation: Strong Match");
        } else if (score >= 50) {
            System.out.println("Recommendation: Moderate Match");
        } else {
            System.out.println("Recommendation: Needs Improvement");
        }
    }

    private String show(List<String> items) {
        return items.isEmpty()
                ? "None"
                : String.join(", ", items);
    }
}

public class AIResumeAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== AI RESUME ANALYZER =====");

        System.out.print("\nEnter your Resume Text: ");
        String resume = input.nextLine();

        System.out.print("Enter Job Description: ");
        String job = input.nextLine();

        ResumeAnalyzer analyzer = new ResumeAnalyzer();
        analyzer.analyze(resume, job);

        input.close();
    }
}
