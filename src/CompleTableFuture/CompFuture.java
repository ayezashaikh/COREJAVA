package CompleTableFuture;

import java.util.concurrent.*;

public class CompFuture {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        System.out.println(calculateAsync().get());
    }

    public static Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello");
            return null;
        });

        return completableFuture;
    }
}
/*

Future
A Future represents the result of an asynchronous computation. Methods are provided to check if
the computation is complete, to wait for its completion, and to retrieve the result of the computation.
The result can only be retrieved using method get when the computation has completed, blocking if necessary until it is
 ready. Cancellation is performed by the cancel method. Additional methods are provided to determine if the
 task completed normally or was cancelled. Once a computation has completed, the computation cannot be cancelled.
If you would like to use a Future for the sake of cancellability but not provide a usable result, you can declare
types of the form Future<?> and return null as a result of the underlying task.

Completebale Future
A Future that may be explicitly completed (setting its value and status), and may be used as a CompletionStage, supporting dependent functions and actions that trigger upon its completion.
When two or more threads attempt to complete, completeExceptionally, or cancel a CompletableFuture, only one of them succeeds.
In addition to these and related methods for directly manipulating status and results, CompletableFuture implements interface CompletionStage with the following policies:
Actions supplied for dependent completions of non-async methods may be performed by the thread that completes the current CompletableFuture, or by any other caller of a completion method.
All async methods without an explicit Executor argument are performed using the ForkJoinPool.commonPool() (unless it does not support a parallelism level of at least two, in which case, a new Thread is created to run each task). This may be overridden for non-static methods in subclasses by defining method defaultExecutor(). To simplify monitoring, debugging, and tracking, all generated asynchronous tasks are instances of the marker interface CompletableFuture.AsynchronousCompletionTask. Operations with time-delays can use adapter methods defined in this class, for example: supplyAsync(supplier, delayedExecutor(timeout, timeUnit)).
To support methods with delays and timeouts, this class maintains at most one daemon thread for triggering and cancelling actions, not for running them.
All CompletionStage methods are implemented independently of other public methods, so the behavior of one method is not impacted by overrides of others in subclasses.
All CompletionStage methods return CompletableFutures. To restrict usages to only those methods defined in interface CompletionStage, use method minimalCompletionStage. Or to ensure only that clients do not themselves modify a future, use method copy.
CompletableFuture also implements Future with the following policies:
Since (unlike FutureTask) this class has no direct control over the computation that causes it to be completed, cancellation is treated as just another form of exceptional completion. Method cancel has the same effect as completeExceptionally(new CancellationException()). Method isCompletedExceptionally can be used to determine if a CompletableFuture completed in any exceptional fashion.
In case of exceptional completion with a CompletionException, methods get() and get(long, TimeUnit) throw an ExecutionException with the same cause as held in the corresponding CompletionException. To simplify usage in most contexts, this class also defines methods join() and getNow that instead throw the CompletionException directly in these cases.
Arguments used to pass a completion result (that is, for parameters of type T) for methods accepting them may be null, but passing a null value for any other parameter will result in a NullPointerException being thrown.
Subclasses of this class should normally override the "virtual constructor" method newIncompleteFuture, which establishes the concrete type returned by CompletionStage methods. For example, here is a class that substitutes a different default Executor and disables the obtrude methods:

Completion Stage
A stage of a possibly asynchronous computation, that performs an action or computes a value when another CompletionStage completes. A stage completes upon termination of its computation, but this may in turn trigger other dependent stages. The functionality defined in this interface takes only a few basic forms, which expand out to a larger set of methods to capture a range of usage styles:
The computation performed by a stage may be expressed as a Function, Consumer, or Runnable (using methods with names including apply, accept, or run, respectively) depending on whether it requires arguments and/or produces results. For example:
 stage.thenApply(x -> square(x))       .thenAccept(x -> System.out.print(x))       .thenRun(() -> System.out.println());
An additional form (compose) allows the construction of computation pipelines from functions returning completion stages.
Any argument to a stage's computation is the outcome of a triggering stage's computation.
One stage's execution may be triggered by completion of a single stage, or both of two stages, or either of two stages. Dependencies on a single stage are arranged using methods with prefix then. Those triggered by completion of both of two stages may combine their results or effects, using correspondingly named methods. Those triggered by either of two stages make no guarantees about which of the results or effects are used for the dependent stage's computation.
Dependencies among stages control the triggering of computations, but do not otherwise guarantee any particular ordering. Additionally, execution of a new stage's computations may be arranged in any of three ways: default execution, default asynchronous execution (using methods with suffix async that employ the stage's default asynchronous execution facility), or custom (via a supplied Executor). The execution properties of default and async modes are specified by CompletionStage implementations, not this interface. Methods with explicit Executor arguments may have arbitrary execution properties, and might not even support concurrent execution, but are arranged for processing in a way that accommodates asynchrony.
Two method forms (handle and whenComplete) support unconditional computation whether the triggering stage completed normally or exceptionally. Method exceptionally supports computation only when the triggering stage completes exceptionally, computing a replacement result, similarly to the java catch keyword. In all other cases, if a stage's computation terminates abruptly with an (unchecked) exception or error, then all dependent stages requiring its completion complete exceptionally as well, with a CompletionException holding the exception as its cause. If a stage is dependent on both of two stages, and both complete exceptionally, then the CompletionException may correspond to either one of these exceptions. If a stage is dependent on either of two others, and only one of them completes exceptionally, no guarantees are made about whether the dependent stage completes normally or exceptionally. In the case of method whenComplete, when the supplied action itself encounters an exception, then the stage completes exceptionally with this exception unless the source stage also completed exceptionally, in which case the exceptional completion from the source stage is given preference and propagated to the dependent stage.
All methods adhere to the above triggering, execution, and exceptional completion specifications (which are not repeated in individual method specifications). Additionally, while arguments used to pass a completion result (that is, for parameters of type T) for methods accepting them may be null, passing a null value for any other parameter will result in a NullPointerException being thrown.
Method form handle is the most general way of creating a continuation stage, unconditionally performing a computation that is given both the result and exception (if any) of the triggering CompletionStage, and computing an arbitrary result. Method whenComplete is similar, but preserves the result of the triggering stage instead of computing a new one. Because a stage's normal result may be null, both methods should have a computation structured thus:
 (result, exception) -> {    if (exception == null) {      // triggering stage completed normally    } else {      // triggering stage completed exceptionally    }  }
This interface does not define methods for initially creating, forcibly completing normally or exceptionally, probing completion status or results, or awaiting completion of a stage. Implementations of CompletionStage may provide means of achieving such effects, as appropriate. Method toCompletableFuture enables interoperability among different implementations of this interface by providing a common conversion type

*/




