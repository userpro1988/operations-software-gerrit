    this(notesFactory, approvalsUtil, queryProvider, db, i, testRepo, subject, files, null);
      // TODO(ekempin): Remove unused ReviewDb
      @SuppressWarnings("unused") ReviewDb db,
      assertReviewers(c, ReviewerStateInternal.REVIEWER, expectedReviewers);
      assertReviewers(c, ReviewerStateInternal.CC, expectedCcs);
          approvalsUtil.getReviewers(notesFactory.createChecked(c)).byState(state);