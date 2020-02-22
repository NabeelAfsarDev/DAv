import { ColumnObject } from './column-object';

describe('ColumnObject', () => {
  it('should create an instance', () => {
    expect(new ColumnObject(10, 'color:string', 10, 0.5)).toBeTruthy();
  });
});
