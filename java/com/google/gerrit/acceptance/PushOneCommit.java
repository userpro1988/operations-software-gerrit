import static java.util.stream.Collectors.toList;
import com.google.gerrit.server.notedb.NotesMigration;
import java.util.stream.Stream;
  private final NotesMigration notesMigration;
  private final ReviewDb db;
      NotesMigration notesMigration,
        notesMigration,
      NotesMigration notesMigration,
        notesMigration,
      NotesMigration notesMigration,
        notesMigration,
      NotesMigration notesMigration,
    this(
        notesFactory,
        approvalsUtil,
        queryProvider,
        notesMigration,
        db,
        i,
        testRepo,
        subject,
        files,
        null);
      NotesMigration notesMigration,
        notesMigration,
      NotesMigration notesMigration,
      ReviewDb db,
    this.db = db;
    this.notesMigration = notesMigration;
      if (notesMigration.readChanges()) {
        assertReviewers(c, ReviewerStateInternal.REVIEWER, expectedReviewers);
        assertReviewers(c, ReviewerStateInternal.CC, expectedCcs);
      } else {
        assertReviewers(
            c,
            ReviewerStateInternal.REVIEWER,
            Stream.concat(expectedReviewers.stream(), expectedCcs.stream()).collect(toList()));
      }
          approvalsUtil.getReviewers(db, notesFactory.createChecked(db, c)).byState(state);