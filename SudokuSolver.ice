module intfc
{
    interface solver
    {
        idempotent void sudokuSolver();
        bool callback();
        void shutdown();
    }
}