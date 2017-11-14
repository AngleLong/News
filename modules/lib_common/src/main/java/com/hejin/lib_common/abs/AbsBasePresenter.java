package com.hejin.lib_common.abs;

/**
 * 作者 : 贺金龙
 * 创建时间 :  2017/11/14 15:07
 * 类描述 : 所有Presenter的基类(基于Abs的MVP)
 * 修改人 :
 * 修改内容 :
 * 修改时间 :
 * 类说明 : 所有的内容都是通过泛型传过来的
 * D 具体的实体类
 * M 具体的Model层
 * IV 具体的接口层
 */
public abstract class AbsBasePresenter<D, M extends AbsBaseModel<D>, IV extends AbsBaseView<D>> implements AbsBaseModel<D> {

    private IV mIView;//这个是P和V连接的接口
    private D mData;//相应的实体类
    private M mModel;//具体的model类

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:28
     * description : 构造方法
     * instructions : 这是是通过创建的时候就直接绑定相应的model了
     */
    public AbsBasePresenter() {
        mModel = bindModel();
    }

    //------------------------------抽象方法------------------------------//

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:26
     * description : 绑定model的方法,这里通过泛型进行绑定
     */
    protected abstract M bindModel();

    //------------------------------生命周期的方法------------------------------//

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:32
     * description : 绑定相应的View层接口的方法
     */
    public void attachIView(IV view) {
        this.mIView = view;
    }

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:33
     * description : 解绑相应的View接口
     */
    public void detachView() {
        this.mIView = null;
    }

    //------------------------------对外暴漏的方法------------------------------//

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:35
     * description : 获取相应的View层
     * todo 但是这里什么这么写我还真的不知道
     */
    public IV getIView() {
        return mIView;
    }

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:39
     * description : 获取相应的Model
     */
    public M getModel() {
        return mModel;
    }

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:35
     * description : 获取相应的数据
     */
    public D getData() {
        return mData;
    }

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:39
     * description : 设置数据的方法
     */
    public void setData(D data) {
        this.mData = data;
    }

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:41
     * description : 如果P层要自己处理数据的话,那么就让P层自己去重写这个方法
     * instructions : 因为你P层这里已经实现了一个Model的接口,所以这里当你的P层要自己处理数据的时候,
     * 直接调用model基类中的方法去实现,直接调用这个方法就直回传给相应的View就可以了,
     * 其实这里P层已经拿到了M层的引用,可以直接调用M层的方法,但是你的P层要是直接处理数据的话呢,说明P层有处理数据的能力,
     * 所以处理好了之后直接通过Presenter这个方法直接回传
     * version :
     */
    @Override
    public void onSuccess(D data) {
        mIView.onResult(data);
    }

    /**
     * author :  贺金龙
     * create time : 2017/11/14 15:50
     * description : 刷新页面状态的
     * instructions : 如果P层处理了数据的话,你记得要舒心页面
     * @param  refreshState 页面的状态
     */
    @Override
    public void onRefreshPage(String refreshState) {
        mIView.onRefreshPager(refreshState);
    }
}
